package com.yedam.java.ch01_01;

public class Student extends People {

	public int studentNo;
	public Student(String name, String ssn, int studentNo) { //기본생성자가 아닌 두개의 매개변수를 받기 때문에
		super(name, ssn); //new People(name, ssn)
		this.studentNo = studentNo;
		
		
		
		
		
		
	}

	
	
	
	
}
z