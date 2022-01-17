package com.yedam.app;

import java.util.Scanner;

import com.yedam.voca.user.User;
import com.yedam.voca.user.UserDAO;
import com.yedam.voca.user.UserDAOImpl;

public class UserFrame {
	
	private UserDAO dao = UserDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);
	
	
	public UserFrame() {
		
		while(true) {
			
			//메뉴출력
			menuPrint();
			//메뉴선택
			int menuNo = menuSelect();
			//각 메뉴별 실행
			if(menuNo == 1) {
				//회원가입
				joinIn();
			} else if(menuNo == 2) {
				//로그인
				logIn();
			} else if(menuNo ==3) {
				//나가기
				end();
				break;
			}
				
		}
	}
	
	
	public void menuPrint() {
		
		System.out.println("-------------------------------");
		System.out.println("  1.회원가입 | 2.로그인 | 3.나가기  ");
		System.out.println("-------------------------------");
		System.out.print("선택>");
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		} catch(Exception e) {
			System.out.println("없는 메뉴입니다.");
		} 
		return menuNo;
	}
	
	//메뉴1) 회원가입
	public void joinIn() {
		User user = inputUserInfo();
		UserDAOImpl.getInstance().insert(user);
	}
	
	//회원 정보 입력 메서드
	public User inputUserInfo() {
		User user = new User();
		System.out.print("아이디:");
		user.setUserId(scanner.nextLine());
		System.out.print("비밀번호:");
		user.setPassword(scanner.nextLine());
		System.out.print("이메일:");
		user.setUserEmail(scanner.nextLine());
		System.out.print("닉네임:");
		user.setUserNickname(scanner.nextLine());
		return user;
	}
	
	
	
	//메뉴2) 로그인
	public void logIn() {
		System.out.print("아이디:");
		String strId = scanner.nextLine();
		System.out.print("패스워드:");
		String strPw = scanner.nextLine();

		new VocaFrame(dao.loginUser(strId, strPw));
	}
	
	
	
	
	
	//메뉴3) 나가기
	public void end() {
		System.out.println("프로그램 종료");
	}
	
	

}
