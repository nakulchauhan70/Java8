package com.demo.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringDemo {

	public static void main(String[] args) {

		String joiner1 = String.join("-", "Hello", "World", null);
		System.out.println(joiner1);
		
//		String joiner2 = String.join(null, "Hello", "World", null);
//		System.out.println(joiner2);

//		String joiner3 = String.join("-", null);	//CE
//		System.out.println(joiner3);
		
		List<String> list = new ArrayList<String>();
		list.add("Nakul");
		list.add("Mukul");
		list.add("Sukul");
		list.add("Rakul");
		
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "Nakul");
		map.put(20, "Sanjay");
		
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		
		String joiner3 = String.join(" ", list);	//set, map will generate CE
		System.out.println(joiner3);
	}

}
