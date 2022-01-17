package com.yedam.voca.user;

import java.sql.SQLException;

import com.yedam.lhr.common.DAO;

public class UserDAOImpl extends DAO implements UserDAO {

	
	//싱글톤
	private static UserDAO instance = new UserDAOImpl();
	private UserDAOImpl() {}
	public static UserDAO getInstance() {
		return instance;
	}
	
	
	//회원가입
	@Override
	public void insert(User user) {
		try {
			connect();
			String insert = "INSERT INTO user VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getUserEmail());
			pstmt.setString(4, user.getUserNickname());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "명의 회원가입이 완료되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}
	
	
	@Override
	public int loginUser(String userId, String password) {
		try {
			connect();
			String select = "SELECT password FROM user WHERE user_id =? ";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(rs.getString(1).contentEquals(password)) {
					int result = 1; //로그인 성공
					return result;
				} else { 
					int result = 0; // 패스워드 틀림
					return result; 
				}
					
			} else { 
				int result = -1; //없는 회원
				return result;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return 0;
	}
	
	

}
