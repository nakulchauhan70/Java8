package com.demo.stream;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Nakul");
		list.add("Mark");
		list.add("Dane");
		list.add("Zack");
		list.add("Nakul");
		
		Stream<String> stream = list.stream();
		//stream.forEach(System.out::println);
		
		Stream<String> distinctStream = stream.distinct();
		//distinctStream.forEach(System.out::println);
		//System.out.println(distinctStream.count());
		
		//count, forach etc are terminal operation, after calling each of these we can't call other terminal method again.
		
		//System.out.println(distinctStream.count());
		//System.out.println(distinctStream.distinct().count());	//stream.distinct().distinct().count();   stream.distinct().count(); => No differenece
	
		System.out.println(distinctStream.distinct().anyMatch(StreamOperationDemo::isNakulMatched));
		
		/*Difference between anyMatch and allMatch and noneMatch
		anyMatch - if stream is empty it will return false and predicate will not be evaluated
		allMatch - if stream is empty it will return true and predicate will not be evaluated
		noneMatch - if stream is empty and none is matched with the defined predicate with stream it will return true, otherwise false*/
		
		System.out.println("----------------------------------------------------------------");
		
		list.stream().filter(StreamOperationDemo::getNakulName).forEach(System.out::println);
		
		System.out.println(list.stream().noneMatch(StreamOperationDemo::doesntMatchAnyName));
		
		ArrayList<String> uris = new ArrayList<String>();
		uris.add("C://abc.txt");
		uris.add("D://xyz.txt");
		
		uris.stream().map(StreamOperationDemo::getPath).forEach(System.out::println);
		
		System.out.println("----------------------------------------------------------------");
		
		List<Details> details = new ArrayList<>();
		
		List<String> parts1 = new ArrayList<>();
		List<String> parts2 = new ArrayList<>();
		
		parts1.add("wiper");
		parts1.add("window");
		parts1.add("windsheet");
		
		parts2.add("tyre");
		parts2.add("engine");
		parts2.add("pump");
		
		details.add(new Details(100, parts1));
		details.add(new Details(200, parts2));
		
		details.stream().flatMap(StreamOperationDemo::getPartsStream).forEach(System.out::println);;
	}

	
	private static boolean isNakulMatched(String s) {
		return s.equalsIgnoreCase("Nakul");
	}
	
	private static boolean getNakulName(String s) {
		return s.equalsIgnoreCase("Nakul");
	}
	
	private static boolean doesntMatchAnyName(String s) {
		return s.equalsIgnoreCase("Zoya");
		//In noneMatch - if predicate return true then noneMatch will give false return and vice versa
	}
	
	private static Path getPath(String s) {
		return Paths.get(s);
	}
	
	private static Stream<String> getPartsStream(Details details){
		return details.getParts().stream();
	}
}

class Details {
	private int detailsId;
	private List<String> parts;

	public Details(int detailsId, List<String> parts) {
		super();
		this.detailsId = detailsId;
		this.parts = parts;
	}

	public int getDetailsId() {
		return detailsId;
	}

	public void setDetailsId(int detailsId) {
		this.detailsId = detailsId;
	}

	public List<String> getParts() {
		return parts;
	}

	public void setParts(List<String> parts) {
		this.parts = parts;
	}

}
