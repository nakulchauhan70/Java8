package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReferenceDemo {

	public static void main(String[] args) {
		Stream<Integer> filter = Stream.of(1, 2, 3, 4).filter(x -> x / 2 == 0);
		Optional<Integer> findAny = filter.findFirst();
		System.out.println(findAny.get());	//if value == null then NoSuchElementException will be thrown

		System.out.println("----------------------------------------------------------------------------------");
		
		List<String> collect = Stream.of("a", "b", "b", "c").filter(x -> x.contains("b")).collect(Collectors.toList());
		Optional<String> findAny2 = collect.stream().findFirst();
		System.out.println(findAny2.get());
		
		Optional<String> findAny3 = collect.stream().findAny();
		System.out.println(findAny3.get());
		
		System.out.println("----------------------------------------------------------------------------------");

		Stream<String> skip = Stream.of("abcd", "efgh", "ijkl", "mnop").skip(1);
		skip.forEach(System.out::println);
		
		System.out.println("----------------------------------------------------------------------------------");

		Stream<String> of = Stream.of("1234", "5678", "9012", "3456");
		of.skip(2).map(x -> x.substring(1)).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("----------------------------------------------------------------------------------");

		List<String> asList = Arrays.asList("NAKUL", "JOAN", "JOHN", "LUMINOUD", "XEN");
		Stream<String> sorted = asList.stream().skip(1).map(x -> x.substring(1)).sorted();
		sorted.forEach(System.out::println);
		//sorted.count();	

	}

}
