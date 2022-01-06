package com.demo.staticdefaultmethod;

public interface InterfB {
	default void m1() {
		System.out.println("Default method of InterfB");
	}
}
