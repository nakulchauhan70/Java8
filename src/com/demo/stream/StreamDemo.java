package com.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		String[] arr = new String[] {"AA", "BB", "CC", "DD"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		
		Stream<Integer> of = Stream.of(10, 20, 30, 40);
		of.forEach(System.out::println);
		
		List<String> list = new ArrayList<>();
		list.add("Nakul");
		list.add("Zack");
		list.add("George");
		list.add("Max");
		
		Stream<String> stream2 = list.stream();
		stream2.forEach(System.out::println);
	}

}
