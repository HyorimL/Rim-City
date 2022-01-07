package com.yedam.java.ch02_01;

public class Car {
	
	Tire frontLeftTire = new Hankook();
	Tire frontRinghtTire = new Hankook();
	Tire backLeftTire = new Hankook();
	Tire backtRightTire = new Hankook();
	
	void run() {
		frontLeftTire.roll();
		frontRinghtTire.roll();
		backLeftTire.roll();
		backtRightTire.roll();
	}
	

}
