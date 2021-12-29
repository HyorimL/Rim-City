package com.yedam.java.ch0401;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		//if문
		
		
		//예제1 - 점수 입력 받아서 70점 이상이면 합격, 미만이면 불합격 출력
		
		/*int score = Integer.parseInt(scanner.nextLine());
		
		if(score >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		*/
		
		
		//예제2 - 정수 한 개를 입력 받아 해당 정수가 2의 배수인지 확인
		
		/*int num = Integer.parseInt(scanner.nextLine());
		
		if(num%2 == 0) {
			System.out.println("2의 배수입니다.");
		} else {
			System.out.println("2의 배수가 아닙니다.");
		}
		*/

		
		
		//예제3 - 점수는 0~100점 사이 값이어야 하며, 벗어날 경우 "점수 입력 오류!" 출력
		//       60점 이상이면 합격, 미만이면 불합격 출력
		
		/*int score = Integer.parseInt(scanner.nextLine());
		
		if( (score<=100) && (score>=0) ) {
			if(score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("점수 입력 오류!");
		}
		*/
		
		//예제4 - 놀이기구, 키 110m 이상일 경우 라바 트위스터 탑승 가능
		//               110m 미만일 경우 보호자가 있는지 체크 -> 유:탑승, 무:탑승 불가 출력
		
		
		/*int height = Integer.parseInt(scanner.nextLine());
		
		
		if( height >= 110 ) {
			System.out.println("라바 트위스터를 탑승할 수 있습니다.");
		} else {
           System.out.println("보호자와 함께 오셨나요?");
           System.out.println("1:보호자와 동행 2:혼자");
           int selected = Integer.parseInt(scanner.nextLine());
           if(selected == 1) {
        	   System.out.println("보호자와 라바 트위스트를 탑승할 수 있습니다.");
           } else {
        	   System.out.println("보호자와 함께 오세요.");
		   } 
		}
		*/
		
		//switch문
		
		//예제1 - 정수를 입력받아 0일 경우 false, 1일 경우 true, 둘 다 아닐 경우 "체크오류" 출력
		
		/*int num = Integer.parseInt(scanner.nextLine());
		
		switch(num) {
		case 0:
			System.out.println("false");
			break;
		case 1:
			System.out.println("true");
			break;
		default:
			System.out.println("체크오류");
			break;
		}
		*/
		
		
		//예제2 - 정수를 입력받아 홀수인지 짝수인지 판별
		
		int num = Integer.parseInt(scanner.nextLine());
		
		switch(num%2) {
		case 0:
				System.out.println("짝수");
				break;
	    default:
	    	    System.out.println("홀수");
	    	    break;
		        
		}
	}

}
