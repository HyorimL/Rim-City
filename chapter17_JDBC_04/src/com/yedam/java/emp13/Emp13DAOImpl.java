package com.yedam.java.emp13;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.common.DAO;
import com.yedam.java.department.Department;

public class Emp13DAOImpl extends DAO implements Emp13DAO {
	
	//싱글톤
	private static Emp13DAO instance = new Emp13DAOImpl();
	private Emp13DAOImpl() {}
	public static Emp13DAO getInstance() {
		return instance;
	}

	
	//전체조회
	@Override
	public List<Emp13> selectAll() {
		List<Emp13> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM emp13 ORDER BY employee_id";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Emp13 emp = new Emp13();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getString("commission_pct"));
				emp.setDepartmentName(rs.getString("department_name"));
				emp.setLocationId(rs.getInt("location_id"));

								
				list.add(emp);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	

	
	//단건조회
	@Override
	public Emp13 selectOne(int employeeId) {
		Emp13 emp = null;
		
		try {
			connect();
			String select = "SELECT * FROM emp13 WHERE employee_id = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setInt(1, employeeId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				emp = new Emp13();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getString("commission_pct"));
				emp.setDepartmentName(rs.getString("department_name"));
				emp.setLocationId(rs.getInt("location_id"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}

	
	
	//등록
	@Override
	public void insert(Emp13 emp) {
		
		try {
			connect();
			String insert = "INSERT INTO emp13 VALUES(?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getJobId());
			pstmt.setInt(4, emp.getSalary());
			pstmt.setString(5, emp.getCommissionPct());
			pstmt.setString(6, emp.getDepartmentName());
			pstmt.setInt(7, emp.getLocationId());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 등록되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		

	}

	
	//수정
	@Override
	public void update(Emp13 emp) {

		try {
			connect();
			String update = "UPDATE emp13 SET first_name = ? WHERE employee_id = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, emp.getFirstName());
			pstmt.setInt(2, emp.getEmployeeId());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 업데이트되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	
	//삭제
	@Override
	public void delete(int employeeId) {

		try {
			connect();
			String delete = "DELETE FROM emp13 WHERE employee_id = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, employeeId);
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 삭제되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
