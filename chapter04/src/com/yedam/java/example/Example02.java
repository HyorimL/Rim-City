package com.yedam.java.example;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		
		//ATM이 있고 입금, 출금, 잔액조회, 종료
		//1.출금을 할 때 잔액보다 많을 경우 "잔액이 부족합니다." 출력
		//2.입금, 출금, 잔액조회 -> 비밀번호로 정보확인
		
	
	Scanner scanner = new Scanner(System.in);
	boolean run = true;
	int balance = 0;
	
	while (run) {
		
		System.out.println("--------------------------------");
		System.out.println("|1.입금 | 2.출금 | 3.잔액조회 | 4.종료|");
		System.out.println("--------------------------------");
		System.out.println("선택> ");
		
		int menuNo = Integer.parseInt(scanner.nextLine());
		
		
		switch (menuNo) {
		
		case 1:
			System.out.println("패스워드를 입력하세요> ");
			String strPasswd1 = scanner.nextLine();
			int password1 = Integer.parseInt(strPasswd1);
			
			if(password1 == 1234) {	
			      System.out.println("예금액> ");
			      balance += Integer.parseInt(scanner.nextLine());
			      } else {
				  System.out.println("패스워드를 잘못 입력하셨습니다.");
			      }
			
			break;
		
		case 2:
			System.out.println("패스워드를 입력하세요> ");
			String strPasswd2 = scanner.nextLine();
			int password2 = Integer.parseInt(strPasswd2);
			
			if(password2 == 1234) {	
			      System.out.println("출금액> ");
			      balance -= Integer.parseInt(scanner.nextLine());
			      } else {
				  System.out.println("패스워드를 잘못 입력하셨습니다.");
			      }
			break;
		case 3:			
			
			System.out.println("패스워드를 입력하세요> ");
			String strPasswd3 = scanner.nextLine();
			int password3 = Integer.parseInt(strPasswd3);
			
			if(password3 == 1234) {	
				  System.out.println("잔액> " + balance);
			      } else {
				  System.out.println("패스워드를 잘못 입력하셨습니다.");
			      }
			break;
		case 4:
			System.out.println("프로그램이 종료되었습니다.");
			run = false;
			break;
		default:
			System.out.println("잘못 선택 하셨습니다.");
		}
				
	}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
