package com.yedam.java.example;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
	
		//커피 4잔과 각각의 가격을 출력하고
		//사용자가 메뉴를 선택한 만큼 가격을 합산해서 출력
		
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		String bill = "*** 영수증 ***\n";
		
		while (run) {
			
		
		
		//1. 메뉴 출력
				
		System.out.println();
		System.out.println("------커피 메뉴-----\n");
		System.out.println("1. 아메리카노 2,000원\n");
		System.out.println("2. 카페라떼 3,500원\n");
		System.out.println("3. 카라멜 마끼아또 5,000원\n");
		System.out.println("4. 자바칩 프라푸치노 6,500원\n");
		System.out.println("5. 프로그램 종료");
		
		
		//2. 사용자가 메뉴를 선택
		int menuNo = scanner.nextInt();
		
		
		//3. 선택한 메뉴에 따라 가격을 합산
		switch(menuNo) {
		case 1:
			sum += 2000;
			bill += "아메리카노 2000원\n";
			break;
		case 2:
			sum += 3500;
			bill += "카페라떼 3500원\n";
			break;
		case 3: 
			sum += 5000;
			bill += "카라멜 마끼아또 5000원\n";
			break;
		case 4:
			sum += 6500;
			bill += "자바칩 프라푸치노 6500원\n";
			break;
		case 5:
			run = false;
			break;
		default:
			System.out.println("메뉴를 잘못 선택하셨습니다.");
		}
	}	
		
		bill += "--------------------------\n";
		bill += " 총 합계 : " + sum + "원";
		System.out.println(bill);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}