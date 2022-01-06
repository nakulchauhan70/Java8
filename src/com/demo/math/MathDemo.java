package com.demo.math;

public class MathDemo {

	public static void main(String[] args) {

		int addExact = Math.addExact(Integer.MIN_VALUE, 10);
		System.out.println(addExact);

		int subtractExact = Math.subtractExact(Integer.MAX_VALUE, Integer.MAX_VALUE);
		System.out.println(subtractExact);

		/*
		 * int overFlowSum = Math.addExact(Integer.MAX_VALUE, 1);
		 * System.out.println(overFlowSum);
		 * 
		 * int subtractExact = Math.subtractExact(Integer.MIN_VALUE, 1);
		 * System.out.println(subtractExact);
		 */

		/*
		 * Both the above implementations will give overflow exception and it id not
		 * handled by Math class Same code with traditional approach will work fine like
		 * below
		 */

		int sum = Integer.MAX_VALUE + 1;
		System.out.println(sum);

		int multiplyExact = Math.multiplyExact(10, 10);
		System.out.println(multiplyExact);

		int incrementExact = Math.incrementExact(10); // will give 11
		System.out.println(incrementExact);
		
		//int negateExact = Math.negateExact(Integer.MIN_VALUE);	//will throw exception because Integer.MIN_VALUE = -2147483648 and Integer.MAX_VALUE = 2147483647,
														//so negative of min value(ie. 2147483648) doesn't exist but negative of max value(ie. -2147483647) DO EXIST
		int negateExact = Math.negateExact(Integer.MAX_VALUE);
		System.out.println(negateExact);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println("-------------------------------------------------------------------------");
		
		int floorDiv = Math.floorDiv(45, 4);	//  45/4 = 11.25 but expression will truncate the value to 11
		System.out.println(floorDiv);
		
		int floorDiv2 = Math.floorDiv(-45, 4);	//	-45/4 = -11.25 but expression will truncate the value to -12
		System.out.println(floorDiv2);			// But Math.floor(-45/4) will give -11.0
		
		int floorDiv3 = Math.floorDiv(45, -4);
		System.out.println(floorDiv3);
		
		int floorDiv4 = Math.floorDiv(-45, -4);
		System.out.println(floorDiv4);
		
		System.out.println(Math.floor(-45/4));
		
		System.out.println("-------------------------------------------------------------------------");
		
		double nextDown = Math.nextDown(Double.NaN);
		System.out.println(nextDown);
		
		double nextDown2 = Math.nextDown(Double.NEGATIVE_INFINITY);
		System.out.println(nextDown2);
		
		double nextDown3 = Math.nextDown(Double.POSITIVE_INFINITY);
		System.out.println(nextDown3);
		
		float nextDown4 = Math.nextDown(0);
		System.out.println(nextDown4);
		
		float nextDown5 = Math.nextDown(1);
		System.out.println(nextDown5);
		
		float nextDown6 = Math.nextDown(-1);
		System.out.println(nextDown6);
		
		
	}

}
