package com.yedam.java.example;

import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {


		//Calculator class -> 사칙연산에 대한 메소드 생성
		
		Calculator myCalc = new Calculator();
		
		int x = 10;
		int y = 4;
		
		System.out.println("더하기 : " + myCalc.plus(x, y));
		System.out.println("빼기 : " + myCalc.minus(x, y));
		System.out.println("곱하기 : " + myCalc.multiply(x, y));
		System.out.println("나누기 : " + myCalc.divide(x, y));
		

		  int result1 = myCalc.plus(6, 3);
	      System.out.println("result1 : " + result1);
	      
	      int result2 = myCalc.minus(6, 3);
	      System.out.println("result2 : " + result2);
	      
	      double result3 = myCalc.divide(10, 4);
	      System.out.println("result3 : " + result3);
	      
	      int result4 = myCalc.multiply(3, 4);
	      System.out.println("result4 : " + result4);
	      
	      
	      
	      //문제2) TV클래스 -> 다음과 같은 형태의 생성자와 메소드를 가진다
	      TV myTV = new TV("LG", 2017, 32);
	      TV myTV1 = new TV("SAMSUNG", 2020, 45);
	      myTV.showInfo(); //LG에서 만든 2017년형 32인치 TV
	      myTV1.showInfo();
	      
	      
	      //문제3) Grade 클래스 -> 3과목의 점수를 입력받아 성적평균의 출력한다.
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("수학, 과학, 영어 순으로 점수 입력>> ");
	      int math = scanner.nextInt();
	      int science = scanner.nextInt();
	      int english = scanner.nextInt();
	      Grade myGrade = new Grade(math, science, english);
	      
	      //average() 메소드는 평균을 계산하여 리턴
	      System.out.println("평균 : " + myGrade.average());
	      
	   }
		
	
		

	}


