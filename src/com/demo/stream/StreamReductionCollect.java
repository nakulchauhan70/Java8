package com.demo.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamReductionCollect {

	public static void main(String[] args) {

		List<Product> asList = Arrays.asList(new Product("Potatoes", 25), new Product("Tomatoes", 60),
				new Product("Garlic", 200), new Product("Onion", 100), new Product("Potatoes", 25));
		
		System.out.println(asList.contains(new Product("Potatoes", 25)));
		//It give false because potatoes is considered as new object 
		//because we haven't override equals and hashcode but below Collectors.toset() is checking exact match 
		//and finds duplicates and hence gives the distinct result
		
		System.out.println("--------------------------------------------------------------------------------");
		
		Set<String> collect = asList.stream().map(Product::getName).collect(Collectors.toSet());
		collect.forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		String collect2 = asList.stream().map(Product::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(collect2);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		Double collect3 = asList.stream().collect(Collectors.averagingInt(Product::getPrice));
		System.out.println(collect3);
		
		System.out.println("--------------------------------------------------------------------------------");

		IntSummaryStatistics collect4 = asList.stream().collect(Collectors.summarizingInt(Product::getPrice));
		System.out.println(collect4);
		
		System.out.println("--------------------------------------------------------------------------------");

		Map<Integer, List<Product>> collect5 = asList.stream().collect(Collectors.groupingBy(Product::getPrice));
		//System.out.println(collect5);
		collect5.forEach((k, v) -> {
			System.out.print(k+" ");
			System.out.println(v);
		});
		
		System.out.println("--------------------------------------------------------------------------------");

		//Dividing stream's element into groups according to some predicate
		Map<Boolean, List<Product>> collect6 = asList.stream().collect(Collectors.partitioningBy(p -> p.getPrice()>50));
		collect6.forEach((k, v) -> {
			System.out.print(k+" ");
			System.out.println(v);
		});
		
		System.out.println("--------------------------------------------------------------------------------");

		//Pushing the collection to perform some additional transformation
		Set<Product> collect7 = asList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
		System.out.println(collect7);
		
		System.out.println("--------------------------------------------------------------------------------");
		
	}

}

class Product {
	private String name;
	private int price;

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}
