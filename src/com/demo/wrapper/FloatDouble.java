package com.demo.wrapper;

public class FloatDouble {

	public static void main(String[] args) {
		
		//Float, Double = 5 new methods
		
		boolean finite1 = Float.isFinite(2000.89f);
		System.out.println(finite1);

		boolean finite2 = Float.isFinite(20f / 0);
		System.out.println(finite2);

		float sum = Float.sum(20f, 10f);
		System.out.println(sum);
		
		float max = Float.max(20f, 10f);
		System.out.println(max);
		
		float min = Float.min(Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.println(min);
		
		float hashcode = Float.hashCode(min);
		System.out.println(hashcode);
	}

}
