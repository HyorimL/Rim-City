package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLExample_Dept {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//부서정보에 대한 테이블
		
		
		
		//1. JDBC Driver 로딩
		Class.forName("org.sqlite.JDBC");
		
		//2. DB 서버 접속
		String url = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";
		Connection conn = DriverManager.getConnection(url);
				
				
		/****************** INSERT *********************/		
		//3. PreparedStatement 객체 생성
		String insert = "INSERT INTO departments VALUES (?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(insert);
		pstmt.setInt(1, 1000);
		pstmt.setString(2, "Hyorim");
		pstmt.setString(3, "HR_LEE");
		pstmt.setInt(4, 5000);
		
		//4. SQL 실행
		int result = pstmt.executeUpdate();
		
		//5. 결과값 출력 or 연산
		System.out.println("insert 결과 : " + result);
		
		
		
		/****************** INSERT *********************/		
		//3. PreparedStatement 객체 생성
		String update = "UPDATE departments SET department_name = ? WHERE department_id = ?";
		pstmt = conn.prepareStatement(update);
		pstmt.setString(1, "Yedam_JAVA");
		pstmt.setInt(2, 1000);
		
		//4. SQL 실행
		result = pstmt.executeUpdate();
		
		//5. 결과값 출력 or 연산
		System.out.println("update 결과 : " + result);
		
				
		/****************** SELECT *********************/		
		//3. PreparedStatement 객체 생성
		String select = "SELECT * FROM departments ORDER BY department_id";
		pstmt = conn.prepareStatement(select);
		
		//4. SQL 실행
		ResultSet rs = pstmt.executeQuery();
		
		//5. 결과값 출력 or 연산
		while(rs.next()) {
			String dept = "부서번호 : " + rs.getInt("department_id")
			               + ", 부서이름 : " + rs.getString("department_name");
			 System.out.println(dept);              
		}
		
		
		
		/****************** DELETE *********************/		
		//3. PreparedStatement 객체 생성
		String delete = "DELETE FROM departments WHERE department_id = ?";
		pstmt = conn.prepareStatement(delete);
		pstmt.setInt(1, 1000);
		
		//4. SQL 실행
		result = pstmt.executeUpdate();
		
		//5. 결과값 출력 or 연산
		System.out.println("delete 결과 : " + result);
				
				
				
		//6. 자원해제
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
		
		
		
		
		
		
		
		
		

	}

}
