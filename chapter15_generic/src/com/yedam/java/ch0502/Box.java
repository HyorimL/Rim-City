package com.yedam.java.ch0502;

public class Box<T> {

	private T t;
	
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
}
