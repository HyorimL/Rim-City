package com.yedam.java.example3;

public class Car {

	//필드
    private static int serialNum = 1000;
	private int carNumber;
	
	
	//생성자
	
	
	//생성될 때마다 자동으로 부여하도록 만든다
    public Car() {
		
		serialNum++;
	
		carNumber =  serialNum;
	}
	
	
	//메소드
    public static int getSerialNum() {
    	return serialNum;
	}


	public int getCarNumber() {
		return carNumber;
	}


	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}


	public static void setSerialNum(int serialNum) {
		Car.serialNum = serialNum;
	}
    
	
	
	
	
}
