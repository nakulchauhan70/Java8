package com.demo.staticdefaultmethod;

public interface InterfA {

	default void m1() {
		System.out.println("Default method of InterfA");
	}

}
