package com.yedam.java.test02;

public class TossCard extends Card {
	
	//필드
	private String company = "Toss";
	private String cardStaff;
	
	
	//생성자
	public TossCard() {
		
	}
	
	public TossCard(String cardStanff) {
		this.cardStaff = "신빛용";
		return;
	}


	
	



	//메소드
	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println("담당직원 - " + cardStaff + ", " + company);
		
	}
	
	
	
	

}
