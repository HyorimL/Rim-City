package com.yedam.java.ch0502;

public class 참조타입예시3 {

	public static void main(String[] args) {
		
		
		// for문으로 배열 복사
		
		int[] oldIntArray = {1, 2, 3} ;
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; //대입시키기
		}
		
		for(int value : newIntArray) {
			System.out.println(value);
		}

		
		
		//System.arraycopy()로 배열복사
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(String str : newStrArray) {
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
