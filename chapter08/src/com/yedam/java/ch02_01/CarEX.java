package com.yedam.java.ch02_01;

public class CarEX {

	public static void main(String[] args) {


		Car myCar = new Car();
		
		
		myCar.run();
		
		
		System.out.println();
				
		
		myCar.frontLeftTire = new Kumho();
		myCar.backtRightTire = new Kumho();
		
		myCar.run();
		
		
	}

}
