package com.yedam.java.ch02_02;

public class HankookTire extends Tire {

	public HankookTire

}

@Override
public boolean roll() {
	accumulatedRotation++;
	if(accumulatedRotation < maxRotation) {
		System.out.println(location + "Tire 수명 : "
				            + (maxRotation - accumulatedRotation) + " 회");
		return true;
	} else {
		System.out.println("*** " + location + " Tire ?");
	}
}