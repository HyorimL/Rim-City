package com.yedam.java.test03;

public class SimplePayment implements Payment {

	
	//필드 - 간편결제할인율
	private double simplePaymentRatio;
	
	
	
	//생성자
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}
	
	
	
	
	@Override
	public int online(int price) {
		double dc1 = price * (simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO);
		price -= dc1;
		return price;
	}

	@Override
	public int offline(int price) {
		double dc2 = price * (simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO);
		price -= dc2;
		return price;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
	    System.out.println("온라인 결제 시 총 할인율 : " + (simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO));
	    System.out.println("오프라인 결제 시 총 할인율 : " + (simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO));

	}

}
