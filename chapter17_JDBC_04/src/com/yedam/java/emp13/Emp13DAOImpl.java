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
		
	}

	@Override
	public void insert(Emp13 emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Emp13 emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int employeeId) {
		// TODO Auto-generated method stub

	}

}
