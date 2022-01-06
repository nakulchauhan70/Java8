package com.demo.staticdefaultmethod;

public class DefaultMethodDemo implements InterfA, InterfB{

	@Override
	public void m1() {
		InterfA.super.m1();
		InterfB.super.m1();
	}
	
	public static void main(String[] args) {
		DefaultMethodDemo demo = new DefaultMethodDemo();
		demo.m1();
	}

}
