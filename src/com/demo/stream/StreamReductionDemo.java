package com.demo.stream;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReductionDemo {

	public static void main(String[] args) {
		OptionalInt reduce = IntStream.range(1, 4).reduce((a, b) -> a + b); // 1+2+3 = 6
		System.out.println(reduce.getAsInt());

		int reduce2 = IntStream.rangeClosed(1, 5).reduce(10, (a, b) -> a + b);
		System.out.println(reduce2);
		
		Integer reduce3 = Arrays.asList(1, 2, 3, 4, 5).parallelStream().reduce(10, (a, b) -> a + b, (a, b) -> {
			System.out.println("Combiner is called...");
			return a+b;
		});					//First - 10+1, 10+2, 10+3, 10+4, 10+5 and then combiner works for adding two at a time
		System.out.println(reduce3);
	}
	
}
