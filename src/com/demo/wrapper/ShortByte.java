package com.demo.wrapper;

public class ShortByte {

	public static void main(String[] args) {
		
		//Byte, Short = 3 methods
		
		int hashcode1 = Short.hashCode((short) 29);	//return int value of short ie same
		System.out.println(hashcode1);
		
		int hashcode2 = Short.toUnsignedInt((short)23);
		System.out.println(hashcode2);
		
		long hashcode3 = Short.toUnsignedLong((short)54);
		System.out.println(hashcode3);
	}

}
