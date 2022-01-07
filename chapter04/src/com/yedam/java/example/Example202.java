package com.yedam.java.ch0402;

import java.util.Scanner;

public class 확인문제7번 {

	public static void main(String[] args) {


		//
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			
		    
		    int password = Integer.parseInt(scanner.nextLine());
		    if(password == 1234) {
		    
		    	
		    	System.out.println("---------------------------------");
				System.out.println("| 1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			    System.out.println("---------------------------------");
			    System.out.println("선택> ");
			    int menuNo = Integer.parseInt(scanner.nextLine());
		    } else {
		    	System.out.println("비밀번호를 잘못 입력하였습니다.");
		    	
		    switch(menuNo) {
		    case 1: //예금
		    	System.out.print("예금액> ");
		    	balance += Integer.parseInt(scanner.nextLine());
		    	break;
		    case 2: //출금
		    	System.out.print("출금액> ");
		    	int num 
		    	balance -= Integer.parseInt(scanner.nextLine());
		    	if()
		    	break;
		    case 3: //잔고
		    	System.out.println("잔고> " + balance);
		    	break;
		    case 4: //종료
		    	run = false;
		    	break;
		    default:
		    	System.out.println("잘못된 메뉴를 선택하였습니다.");
		    }
		}
		    
			
		}
		
		
		System.out.println("프로그램 종료");

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
