package com.yedam.java.ch01_01;

public class CellPhone {
	
	//필드
	String model;
	String color;
	
	//생성자
	
	
	//메소드
	void powerOn() {
		System.out.println("전원을 겹니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	void bell() {
		System.out.println("벨이 울립니다");
	}
	
	void sendVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	
	void hangUp() {
		System.out.println("통화를 종료합니다");
	}
	
	

}
