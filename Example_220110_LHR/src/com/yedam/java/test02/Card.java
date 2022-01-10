package com.yedam.java.test02;

public class Card {

	
	
	//필드
	private String cardNo;
	private String validDate;
	private String cvc;
	
	
	
	//생성자
	public void Card(String cardNo, String validDate, String cvc) {
		this.cardNo = "5432-4567-9534-3657";
		this.validDate = "20251203";
		this.cvc = "253";
		return;
	}



	//메소드
	public String getCardNo() {
		return cardNo;
	}



	public String getValidDate() {
		return validDate;
	}



	public String getCvc() {
		return cvc;
	}

	
	
	public void showCardInfo() {
		System.out.println("카드정보 ( Card NO : " + cardNo 
				          + ", 유효기간 : " + validDate 
				          + ", CVC : " + cvc);
	}
	
}
