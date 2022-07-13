package pojo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.Reader;
public class MysqlConnect {
	private SqlSession session;
	public MysqlConnect() {
		String resources = "mybatis-config.xml";
		//创建流
		Reader reader = null;
		try {
			//读取mybatis-config.xml 文件内容到reader对象中
			reader = Resources.getResourceAsReader(resources);
		}catch(IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		session = sqlMapper.openSession();
	}
	public SqlSession getSession() {
		return session;
	}
}
