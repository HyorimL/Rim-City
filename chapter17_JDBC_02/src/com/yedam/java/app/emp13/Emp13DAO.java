package com.yedam.java.app.emp13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.app.dept.Department;

public class Emp13DAO {
	
	
	//DB 연결정보
	private String jdbc_driver = "org.sqlite.JDBC";
	private String jdbc_url = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";
	
	//각 메소드에서 공통적으로 사용하는 필드 선언
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//싱글톤
	//자기자신을 필드로 선언
	private static Emp13DAO instance = new Emp13DAO();
	private Emp13DAO() {}
	//싱글톤선언
	public static Emp13DAO getInstance() {
		return instance;
	}
	
	
	//메소드
	//JDBC Driver 로딩
	//DB 연결 -> connect() 메소드
	public void connect() {
		
		try {
			
			Class.forName(jdbc_driver); //JDBC Driver 로딩
			
			conn = DriverManager.getConnection(jdbc_url);
			
		} catch(ClassNotFoundException e) {
			
			System.out.println("JDBC Driver 로딩 실패");
		
		} catch(SQLException e) {
			
			System.out.println("DB와 연결 실패");
			
		}
	}
	
	//자원해제 -> disscount() 메소드
	public void disconnect() {
		
		try {
			
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			
		} catch(SQLException e) {
			System.out.println("자원이 정상적으로 해제되지 못했습니다.");
		}
		
	}
	
	
	//PreparedStatement 객체 생성
	//SQL 실행
	//결과값 출력 or 연산
	// -> CRUD 메소드
	
	//전체조회
	public List<Emp13> selectAll() {
		   List<Emp13> list = new ArrayList<>();
		
		   try {
			   connect();
			   String select = "SELECT * FROM emp13 ORDER BY employee_id";
			   pstmt = conn.prepareStatement(select);
			   rs = pstmt.executeQuery();
			   
			   while(rs.next()) {
				   Emp13 emp13 = new Emp13();
				   emp13.setEmployeeId(rs.getInt("employee_id"));
				   emp13.setFirstName(rs.getString("first_name"));
				   emp13.setJobId(rs.getString("job_id"));
				   emp13.setSalary(rs.getInt("salary"));
				   emp13.setCommissionPct(rs.getString("commission_pct"));
				   emp13.setDepartmentName(rs.getString("department_name"));
				   emp13.setLocationId(rs.getInt("location_id"));
				   
				   list.add(emp13);
			   }
			   
		   } catch(SQLException e) {
			   e.printStackTrace();
		   } finally {
			   disconnect();
		   }
		   
		return list;
	}
	
	//단건조회
	public Emp13 selectOne(int employeeId) {
		Emp13 emp13 = null;
		
		try {
			connect();
			String select = "SELECT * FROM emp13 WHERE employee_id = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setInt(1, employeeId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				emp13 = new Emp13();
				emp13.setEmployeeId(rs.getInt("employee_id"));
				emp13.setFirstName(rs.getString("first_name"));
				emp13.setJobId(rs.getString("job_id"));
				emp13.setSalary(rs.getInt("salary"));
				emp13.setCommissionPct(rs.getString("commission_pct"));
				emp13.setDepartmentName(rs.getString("department_name"));
				emp13.setLocationId(rs.getInt("location_id"));
				
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
			
		} finally {
			disconnect();
		}
		return emp13;
	}
	
	//등록
	public void insert(Emp13 emp13) {
		
		try {
			connect();
			String insert = "INSERT INTO emp13 VALUES (?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, emp13.getEmployeeId());
			pstmt.setString(2, emp13.getFirstName());
			pstmt.setString(3, emp13.getJobId());
			pstmt.setInt(4, emp13.getSalary());
			pstmt.setString(5, emp13.getCommissionPct());
			pstmt.setString(6, emp13.getDepartmentName());
			pstmt.setInt(7, emp13.getLocationId());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 등록되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}
	
	//수정
	public void update(Emp13 emp13) {
		try {
			
			connect();
			String update = "UPDATE emp13 SET first_name = ? WHERE employee_id = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, emp13.getFirstName());
			pstmt.setInt(2, emp13.getEmployeeId());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 접수되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		
		} finally {
			disconnect();
		}
	}
	
	//삭제
	public void delete(int employeeId) {
		try {
			
			connect();
			String delete = "DELETE FROM emp13 WHERE employee_id = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, employeeId);
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 접수되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
