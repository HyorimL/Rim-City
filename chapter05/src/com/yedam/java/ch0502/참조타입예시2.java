package com.yedam.java.ch0502;

public class 참조타입예시2 {

	public static void main(String[] args) {
		
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		
		//다차원 배열 -> 배열의 배열
		System.out.println();
		
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "]" + k + "]" + mathScores[i][k]);
			}
		}
		
		
		//계단식 구조 다차원 배열 
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
			System.out.println("englishScores[" + i + "][" + k + "]:" + englishScores[i][k]);
			
		}
		}
		
		System.out.println();
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };
		// -> int[2][] -> int[2] / int[3];
		
		
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "]:" + javaScores[i][k]);
				
			}
		}
		
		
		
		
	}

}
