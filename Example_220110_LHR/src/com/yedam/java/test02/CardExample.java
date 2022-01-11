package com.yedam.java.test02;

public class CardExample {

	public static void main(String[] args) {


		//전부 null로 나옴.........
		TossCard tossCard = new TossCard("신빛용");
		tossCard.showCardInfo( );
		
		DGBCard dgbCard = new DGBCard("신빛용");
		dgbCard.showCardInfo();
		
		

	}

}
