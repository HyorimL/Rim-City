package test;

public class SalaryMan {

	//필드
	String salaryMan;
	private int salary; 
	
	
	
	
	//생성자
	SalaryMan() {
		this.salary = 1000000;
	}
		
	SalaryMan(int salary) {
		this.salary = salary;
	}

	
	
	
	//메소드
	int getAnnualGross() {
		int salary = 0;
		int salarys = salary * 12 + salary * 5;
		System.out.println();
	
		return salarys;
	}
	
	
}
