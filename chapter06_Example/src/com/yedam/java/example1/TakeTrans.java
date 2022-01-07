package com.yedam.java.example1;

public class TakeTrans {

	public static void main(String[] args) {


		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		
		Bus bus100 = new Bus(100);
		
		studentJames.takeBus(bus100); //버스를 타는 행위
		studentJames.showInfo();
		bus100.showInfo(); //각가의 정보확인
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
	}

}
