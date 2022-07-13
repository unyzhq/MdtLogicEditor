package mdtLogicEditor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import pojo.Entrys;

public class treeTest {
	@Test
	public void testt() {
		ArrayList<String> al = new ArrayList<String>();
		go(al);
		System.out.println(al.get(0));
	}
	public void go(ArrayList<String> al) {
		al.add("hello");
	}
	public void test() {
		String[] values = {"read","write","draw","drawflush","packcolor","print","printflush","getlink","control"};
		ArrayList<String> dict = new ArrayList<String>();
		for(int i = 0;i < values.length;i++) {
			dict.add(values[i]);
		}
		System.out.println(dict);
		Collections.sort(dict);
		System.out.println(dict);
		ArrayList<String> result = new ArrayList<String>(values.length);
		outputBalanced(result,dict,0,dict.size());
		System.out.println(result);
		
	}
	class table{
		//一个内部内，代表数据表对应的类。
		public void get() {
			System.out.println("正在查询数据！");
		}
	}
	class node{
		//三叉树
		public table value;
		protected node leftNode;
		protected node eqNode;
		protected node righrNode;
		protected char splitchar;
		protected node(char splitchar) {
			this.splitchar = splitchar;
		}
		public String toString() {
			return "" + splitchar;
		}
	}
	//根据outputBalanced算法
	//首先对数组排序
	//检查根节点是否为空
	//如果根节点为空
	//则生成一个新节点作为根节点
	//否则
	//从根节点开始检索
	//#每匹配到一个字符
	//#移除掉当前词条的对应字符
	//#如果不匹配
	//#那么检测当前词条的首字母按顺序应当排在当前节点字母的左边还是右边
	//#如果是左边
	//#则继续历遍左子树
	//#否则历遍右子树
	//重复#流程直到当前节点为null
	//在此处生成一个新的节点
	//剩余字母作为该节点的中节点
	//由于部分词条还需要展示别的内容，
	//因此还需添加一个内容属性，
	//该属性可以作为断点以避免一个词是另一个词的组成部分的问题
	//此内容属性与数据库关联，
	//如果内容属性为空，则证明当前节点并不是一个完整的词。由于每个词条的类都不一定相同，因此建议使用父类代替。
	/**
	 * 在调用此方法前，先把词典数组dict排好序
	 * 
	 * @param reuslt
	 *            写入平衡序的数组
	 * @param dict
	 *            排好序的词典数组
	 * @param offset
	 *            偏移量
	 * @param len
	 *            长度
	 */
	public void outputBalanced(ArrayList<String> result,ArrayList<String> dict, int offset, int len){
		int temp;
		if ( len < 1 ) return;
			
		temp = len >> 1;   // temp=len/2
 
		String item = dict.get(temp + offset );
		result.add(item);// 把词条存入到数组
		outputBalanced(result, dict, offset, temp); // 输出左半部分
		outputBalanced(result, dict, offset + temp + 1, len - temp - 1); // 输出右半部分
	}
}
