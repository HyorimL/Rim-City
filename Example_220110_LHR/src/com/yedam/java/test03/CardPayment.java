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
		double dc1 = price * (cardRatio + Payment.ONLINE_PAYMENT_RATIO);
		price -= dc1;
		return price;
	}

	@Override
	public int offline(int price) {
		double dc2 = price * (cardRatio + Payment.OFFLINE_PAYMENT_RATIO);
		price -= dc2;
		return price;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
	    System.out.println("온라인 결제 시 총 할인율 : " + (cardRatio + Payment.ONLINE_PAYMENT_RATIO) );
	    System.out.println("오프라인 결제 시 총 할인율 : " + (cardRatio + Payment.OFFLINE_PAYMENT_RATIO));

	}

}
