package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReductionAndCollectionDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		
		Integer sum = list.stream().reduce(10, (x,y) -> x+y);	//add initial value(10) + sum of element of array
		System.out.println(sum);
		
		System.out.println("----------------------------------------------------------------");

		
		List<String> list1 = Arrays.asList("Nakul", "Max", "Jack", "Zarem");
		list1.stream().map(element -> element.toUpperCase()).collect(Collectors.toList()).forEach(ReductionAndCollectionDemo::printInMyWay);
		
	}
	
	private static void printInMyWay(String s) {
		System.out.print(s+" ");
	}

}
