package com.yedam.voca.user;

public class User {
	
	private String userId;
	private String password;
	private String userEmail;
	private String userNickname;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	@Override
	public String toString() {
		return "[회원정보] ID: " + userId + ", e-mail: " + userEmail + ", 닉네임: " + userNickname;
	}
	
	
	

}
