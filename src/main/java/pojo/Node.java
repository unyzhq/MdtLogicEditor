package pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Node {//三叉树，用于快速搜索匹配的词条
	public static Node root;
	public Node leftNode;
	public Node eqNode;
	public Node rightNode;
	public char splitchar;
	public Entrys entry;
	public Node() {
		
	}
	public Node(char splitchar) {
		this.splitchar = splitchar;
		if(root == null) {
			root = this;
		}
	}
	public Node(HashMap<String,Entrys> map) {
		for(String str : map.keySet()) {
			new Node(str.charAt(0));
			break;
		}
		createTernarySearchTrie(map);
	}
	private void createTernarySearchTrie(HashMap<String,Entrys> map) {//初始化三叉树
		Node presentNode = root;
		for(Map.Entry<String,Entrys> entry : map.entrySet()) {
			addEntry(entry.getKey(),entry.getValue(),presentNode);
			presentNode = root;
		}
	}
	private void addEntry(String str,Entrys entry,Node presentNode) {//将一个词条存入三叉树
		if(str.length() == 0) {//并不多余，原因是有可能新加入的词条是已有词条的前缀，这时此代码块就可以正确将其存入三叉树。
			presentNode.entry = entry;
			return;
		}else if(str.charAt(0) == presentNode.splitchar) {
			str = str.substring(1);
			if(presentNode.eqNode == null) {
				while(str.length() != 0) {
					presentNode.eqNode = new Node(str.charAt(0));
					str = str.substring(1);
					presentNode = presentNode.eqNode;
				}
				presentNode.entry = entry;
				return;
			}
			presentNode = presentNode.eqNode;
			addEntry(str,entry,presentNode);
		}else if(str.charAt(0) < presentNode.splitchar) {
			if(presentNode.leftNode == null) {
				presentNode.leftNode = new Node(str.charAt(0));
				presentNode = presentNode.leftNode;
				str = str.substring(1);
				while(str.length() != 0) {
					presentNode.eqNode = new Node(str.charAt(0));
					str = str.substring(1);
					presentNode = presentNode.eqNode;
				}
				presentNode.entry = entry;
				return;
			}
			presentNode = presentNode.leftNode;
			addEntry(str,entry,presentNode);
		}else {
			if(presentNode.rightNode == null) {
				presentNode.rightNode = new Node(str.charAt(0));
				presentNode = presentNode.rightNode;
				str = str.substring(1);
				while(str.length() != 0) {
					presentNode.eqNode = new Node(str.charAt(0));
					str = str.substring(1);
					presentNode = presentNode.eqNode;
				}
				presentNode.entry = entry;
				return;
			}
			presentNode = presentNode.rightNode;
			addEntry(str,entry,presentNode);
		}
	}
	public ArrayList<Entrys> search(String str){//搜索与str匹配的词条并返回，对外可见
		ArrayList<Entrys> result = new ArrayList<Entrys>();
		Node presentNode = root;
		search(str,presentNode,result);
		return result;
	}
	private void search(String str,Node presentNode,ArrayList<Entrys> result) {//搜索与str匹配的词条，根据情况使用不同方法存入result
		if(str.length() == 0 && presentNode == null) {//找到了完全匹配的词条
			return;
		}else if(str.length() == 0 && presentNode != null) {//找到了匹配的词条前缀
			search(presentNode,result);
			return;
		}else if(str.length() != 0 && presentNode == null) {//没有找到匹配的词条
			return;
		}
		if(str.charAt(0) == presentNode.splitchar) {
			str = str.substring(1);
			if(str.length() == 0 && presentNode.entry != null) {
				result.add(presentNode.entry);
			}
			presentNode = presentNode.eqNode;
			search(str,presentNode,result);
		}else if(str.charAt(0) < presentNode.splitchar) {
			presentNode = presentNode.leftNode;
			search(str,presentNode,result);
		}else {
			presentNode = presentNode.rightNode;
			search(str,presentNode,result);
		}
	}
	private void search(Node presentNode,ArrayList<Entrys> result) {//将presentNode(当前节点)下所有节点的entry(词条)存入result
		if(presentNode != null) {
			if(presentNode.entry != null) {
				result.add(presentNode.entry);
			}
			search(presentNode.leftNode,result);
			search(presentNode.eqNode,result);
			search(presentNode.rightNode,result);
		}
		return;
	}
}
