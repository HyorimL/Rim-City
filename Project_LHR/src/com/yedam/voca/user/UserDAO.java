package com.yedam.voca.user;

public interface UserDAO {
	
	//회원등록
	public void insert(User user);
		
	//
	public int loginUser(String userId, String password);
	
}
