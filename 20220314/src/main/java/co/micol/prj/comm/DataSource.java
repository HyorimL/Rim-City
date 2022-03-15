package co.micol.prj.comm;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {
	//싱글톤 클래스 생성 
	
	private static SqlSessionFactory sqlSessionFactory;

	private DataSource() {} // 외부에서 내 자신을 생성하지 못하도록 생성자를 만듦

	public static SqlSessionFactory getInstance() {
		String resource = "config/mybatis-config.xml"; // 환경파일의 위치

		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sqlSessionFactory;
	}

}
