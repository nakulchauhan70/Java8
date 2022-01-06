package com.demo.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Integer a = null;
		Integer b = new Integer(20);
		
		Optional<Integer> optionalOfNullable = Optional.ofNullable(a);
		Optional<Integer> optionalOf = Optional.of(b);
		
		sum(optionalOfNullable,optionalOf);
		
	}

	private static void sum(Optional<Integer> optionalOfNullable, Optional<Integer> optionalOf) {
		System.out.println("First parameter is present : "+optionalOfNullable.isPresent());
		System.out.println("Second parameter is present : "+optionalOf.isPresent());
		
		int a = optionalOfNullable.orElse(new Integer(0));
		int b = optionalOf.orElse(new Integer(0));
		
		System.out.println(a+b);

	}

}
