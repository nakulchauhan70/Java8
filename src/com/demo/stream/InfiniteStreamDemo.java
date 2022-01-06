package com.demo.stream;

import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamDemo {
	public static void main(String[] args) {
		Stream<Integer> iterate = Stream.iterate(100, i -> i + 2);
		iterate.limit(5).collect(Collectors.toList()).forEach(System.out::println);
		
		/*int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		for (int j = 0; j < 10; j++) {
			
		}
		
		Similar to below
		
		Stream.iterate(0, i -> i+1);*/
		
		System.out.println("---------------------------------------------------------------");
		
		Supplier<UUID> randomUUID = UUID::randomUUID;
		Stream<UUID> generate = Stream.generate(randomUUID);
		generate.limit(20).skip(10).collect(Collectors.toList()).forEach(System.out::println);
		
		
		//limit(10).skip(10) - it will produce 0 result
		//skip(10).limit(10) - it  will produce 10 result
	}
}
