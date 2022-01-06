package com.demo.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		
		//Stream<Object> build = Stream.builder().add("Nakul").add("Dane").add("Rocky").build();

		Stream<String> build = Stream.<String>builder().add("Nakul").add("Dane").add("Rocky").build();
		build.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		Stream<String> limit = Stream.generate(() -> "Hello").limit(10);
		limit.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------");

		Stream<Integer> iterate = Stream.iterate(10, i->i+1).limit(10);
		iterate.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------");

		IntStream range = IntStream.range(1, 5);
		range.forEach(System.out::println);
		
		System.out.println();
		
		IntStream range2 = IntStream.rangeClosed(1, 5);
		range2.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------");

		Random random = new Random();
		DoubleStream doubles = random.doubles(5);	//random.doubles() - infinite no of double stream
		doubles.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------");

		IntStream chars = "Nakul".chars();
		chars.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------");

		//Path path = Paths.get("G:\\Nakul\\Notes\\Spring.txt");
		Path path = Paths.get("imp.txt");
		
		try(Stream<String> lines = Files.lines(path, Charset.forName("UTF-8"));) {	//Or Files.lines(path); - it will produce the same result
			lines.forEach(System.out::println);			//So your Spring.txt does not contain valid UTF-8 and is causing the UTF-8 decoder to report an error.

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
