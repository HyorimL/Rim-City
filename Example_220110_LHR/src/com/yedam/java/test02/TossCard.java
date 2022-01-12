package com.yedam.java.test02;

public class TossCard extends Card {
	
	//필드
	private String company = "Toss";
	private String cardStaff;
	
	
	//생성자
	public TossCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}
	
	
	//메소드
	@Override
	public void showCardInfo() {
			System.out.println("카드정보 - card No, " + cardNo);
			System.out.println("담당직원 - " + cardStaff + ", " + company);
	}
	
	
	
	

}
