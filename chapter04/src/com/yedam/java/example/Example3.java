package com.yedam.java.example;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		
		//<up&down>
		//1부터 10사이의 임의의 숫자를 발생시킵니다.
		//총 3번의 기회가 있다.
		//기회 내에 미성공 시 프로그램 종료.
		
		Scanner scanner = new Scanner(System.in); 
		
		int comNum = (int)(Math.random() * 10) + 1;
		
		int InputNum = 0;
		
		while(true) {
      
			
			System.out.println("1부터 10까지 숫자 중 하나를 입력하세요");
			int selected = scanner.nextLine();
			
		
		
		if(inputNum < comNum) {
			System.out.println("UP!");
		} else if(inputNum > comNum) {
			System.out.println("DOWN!");
		} else {
			System.out.println("맞추셨습니다!");
			break;
		}
		
		if(inputNum == 3) {
			System.out.println("기회가 모두 소진 되었습니다.");
		}
		
	  } System.out.println("3번의 기회가 끝났습니다. 다음 기회에!");
		
		
	// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
			//		 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
			//		 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며, 
			//		 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
			//		 HiNT : 이중 IF문 사용
			//		 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
			
			System.out.println();
			System.out.println("[문제2]");
			
			System.out.print("YEAR : ");
			int year = Integer.parseInt(scanner.nextLine());
			
			if(year%4 == 0) {			
				if(year%100 != 100) {
					System.out.println("윤년입니다.");				
				} 
			} else {
				System.out.println("윤년이 아닙니다.");	
		
		
		
	}

}
