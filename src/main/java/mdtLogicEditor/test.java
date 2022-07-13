package mdtLogicEditor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.*;
public class test {
	@Test
	public void main() {
		MysqlConnect MC = new MysqlConnect();
		SqlSession session =  MC.getSession();
		//查找所有词条
		List<Logics> LL = session.selectList("findLogics");
		List<Options> LO = session.selectList("findOptions");
		List<GlobalVars> LG = session.selectList("findGlobalVars");
		List<Tips> LT = session.selectList("findTips");
		
		ArrayList<Entrys> entrys = new ArrayList<Entrys>();
		//将所有词条存入Entrys类中作为一个集合
		for(Logics i : LL) {
			entrys.add(new Entrys(i));
		}
		for(Options i : LO) {
			entrys.add(new Entrys(i));
		}
		for(GlobalVars i : LG) {
			entrys.add(new Entrys(i));
		}
		
		//将Entrys集合转化为HashMap
		HashMap<String,Entrys> map = new HashMap<String,Entrys>();
		for(Entrys e : entrys) {
			map.put(e.value, e);
		}
		//用map初始化一个三叉树
		Node node = new Node(map);
		//
		//使用三叉树的search方法，传入字符串，就能返回以该字符串作为前缀的所有词条
		for(Entrys e : node.search("p")) {//历遍并打印输出
			System.out.println(e.value);
			if(e.isGlobalVars()) {
				System.out.println(e.globalVar);
			}else if(e.isLogics()) {
				System.out.println(e.logic);
			}
		}
		session.close();
	}
}
