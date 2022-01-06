package com.demo.wrapper;

public class IntegerLong {
	public static void main(String[] args) {
		
		//Integer class = 12 methods
		//Long class = 11 method
		//Extra method = public static long toUnsignedLong(int x)
		
		//Unsigned = only positive 
		//Signed = both positive and negative
		
		String unsignedString = Integer.toUnsignedString(1000, 2);		//Converting 1000 to binary equivalent
		System.out.println(unsignedString);
		
		String str = Integer.toUnsignedString(1000);
		System.out.println(str);
		
		int unsignedInt  = Integer.parseUnsignedInt("1000", 2);
		System.out.println(unsignedInt);
		
		int divide = Integer.divideUnsigned(100, 20);
		System.out.println(divide);
		
		int remainder = Integer.remainderUnsigned(100, 9);
		System.out.println(remainder);
		
		int sum = Integer.sum(10, 20);
		System.out.println(sum);
	}
}
