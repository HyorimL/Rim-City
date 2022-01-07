package com.yedam.java.ch02_03;

public class Main {

	public static void main(String[] args) {


		ImpelementationC impl = new ImpelementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		

	}

}
