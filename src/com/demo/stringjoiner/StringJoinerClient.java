package com.demo.stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerClient {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(",");
		stringJoiner.add("how").add("are").add("you?");
		System.out.println(stringJoiner);

		StringJoiner stringJoiner2 = new StringJoiner(" ", "[", "]");
		stringJoiner2.add("India").add("is").add("beautiful").add("country.");
		System.out.println(stringJoiner2);

		StringJoiner merger = stringJoiner.merge(stringJoiner2);
		System.out.println(merger);									//how,are,you?,India is beautiful country.
		System.out.println(stringJoiner);							//how,are,you?,India is beautiful country.
																	//Now both merger and stringjoiner are equal
		
		StringJoiner merger2 = stringJoiner2.merge(stringJoiner);
		System.out.println(merger2);									//[India is beautiful country. how,are,you?]
		
		String join = String.join("-", "Hello", "India", null);
		System.out.println(join);

		List<String> list = Arrays.asList("I", "leave", "in", "India");
		String join2 = String.join(" -", list);
		System.out.println(join2);
	}

}
