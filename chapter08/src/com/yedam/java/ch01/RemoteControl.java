package com.yedam.java.ch01;

public interface RemoteControl {
	
	
	

	//상수
	public final static int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; //인터페이스에서는 자동으로 final static에 추가됨
	
	
	//추상메소드
	public abstract void turnOn();
	public void turnOff(); //추상메소드로 자동컴파일 됨
	public void setVolume(int volume);


}
