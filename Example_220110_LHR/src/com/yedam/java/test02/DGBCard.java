package com.yedam.java.test02;

public class DGBCard extends Card {

	
	//필드
	private String company = "대구은행";
	private String cardStaff;
	
	
	//생성자
	DGBCard() {
		
	}
	
	public DGBCard(String cardStaff) {
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
