package test;

public class StudentScore {
	
	//필드
	private String name;
	private int grade;
	private int korean;
	private int english;
	private int math;
	
	
	
	//생성자
	public StudentScore(String name, int grade) {
		this.name = name;
		this.grade = grade;		
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getGrade() {
		return grade;
	}




	public void setGrade(int grade) {
		this.grade = grade;
	}




	public int getKorean() {
		return korean;
	}




	public void setKorean(int korean) {
		this.korean = korean;
	}




	public int getEnglish() {
		return english;
	}




	public void setEnglish(int english) {
		this.english = english;
	}




	public int getMath() {
		return math;
	}




	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	public int getTotal() {
		return korean + english + math;
	}
	
		
	
	
	public double getAverage() {
		return getTotal() / 3.0;
	}
	

}
