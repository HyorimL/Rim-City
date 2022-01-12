package com.yedam.java.test03;

public interface Payment {

	
	//상수필드
	public static final double ONLINE_PAYMENT_RATIO = 0.05;
	public double OFFLINE_PAYMENT_RATIO = 0.03;
	
	
	//추상메서드
	public abstract int online(int price);
	public int offline(int price);
	public void showInfo();	
	
}
