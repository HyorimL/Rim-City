package TEST;

public class 문제3 {

	public static void main(String[] args) {
		
		
		
		
		
		//
		
		int num1 = 10;
		int num2 =2;
		char operator = '+';
		
		
		if(operator == '+') {
			int result1 = num1 + num2;
			System.out.printf("%d + %d = %d", num1, num2, result1);
		} else if(operator == '-') {
			int result2 = num1 - num2;
			System.out.printf("%d - %d = %d", num1, num2, result2);
		} else if(operator == '*') {
			int result3 = num1 * num2;
			System.out.printf("%d * %d = %d", num1, num2, result3);
		} else {
			int result4 = num1 / num2;
			System.out.printf("%d / %d = %d", num1, num2, result4);		
		}
		
		
		
	}

}
