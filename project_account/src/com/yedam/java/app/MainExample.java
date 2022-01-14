package com.yedam.java.app;

import java.util.Scanner;

public class MainExample {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		

		boolean run = true;
		
		
		while(true) {
			
			menuPrint();
			
			int menuNo = menuSelect();
			
			if(menuNo == 1) {
				insertUser();
			} else if (menuNo == 2) {
				loginUser();
			} else if(menuNo == 3) {
				end();
				break;
			}
			
			
		}
		
		
	}
		public static void insertUser() {
			User user = inputUserInfo();
			UserDAOImpl.getInstance().insert(user);
		}
		
		public static void loginUser() {
			User user = inputLoginInfo();
			User loginUser = UserDAOImpl.getInstance().selectUserInfo(user);
			if(loginUser == null) {
				System.out.println("회원정보를 확인해주세요");
				
			} else if(loginUser.getAuth() == 0) {
				//관리자일때 실행하는 메뉴
				new AccountFrame().run();
			} else if(loginUser.getAuth() == 1) {
				//일반회원일 때 실행하는 메뉴
			}
		
		
		
		
		
		new AccountFrame().run();

	}

}
