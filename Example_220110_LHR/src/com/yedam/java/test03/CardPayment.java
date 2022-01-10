package com.yedam.java.test03;

public class CardPayment implements Payment {

	
	//필드
	//카드할인율
	private double cardRatio;
	
	
	//생성자
    public CardPayment(double cardRatio) {
    	this.cardRatio = cardRatio;
    }
	
	
	
	@Override
	public int online(int price) {
		
		return price;
	}

	@Override
	public int offline(int price) {
		return price;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
	    System.out.println("온라인 결제 시 총 할인율 : " + cardRatio );
	    System.out.println("오프라인 결제 시 총 할인율 : " + cardRatio );

	}

}
