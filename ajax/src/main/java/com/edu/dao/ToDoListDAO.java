package com.edu.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToDoListDAO extends DAO {
	
	
	public void insertToDo(int doId, String doContent) {
		
		String sql = "insert into to_do_list (do_id, do_content) "
				    + "values(TO_DO_SEQ.nextval, ?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, doContent);
			int n = psmt.executeUpdate();
			System.out.println(n + "건이 입력되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public List<Map<String, String>> todoList() { 
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		
		try {
			String sql = "select * from to_do_list";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				Map<String, String> map = new HashMap<>();
				map.put("doId", rs.getString("do_id"));
				map.put("doContent", rs.getString("do_content"));
				list.add(map);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
