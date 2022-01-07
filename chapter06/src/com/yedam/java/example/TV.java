package com.yedam.java.example;

public class TV {

	
	
	//필드
	String company;
	int years;
	int inch;
	
	
	//생성자
	TV() {
		
	}
	TV(String company, int years, int inch) {
		this.company = company;
		this.years = years;
		this.inch = inch;
     }
	
	
	//메소드
	void showInfo() {
		System.out.println(company + "에서 만든 " + years + "년형 " + inch + "인치 TV");
	}
 
	

	
	
	
	
}	
