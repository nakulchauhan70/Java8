package com.demo.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main8 {

	public static void main(String[] args) {

		List<Person> listPerson = Arrays.asList(new Person("ABC", "Kukreja", "Mum"),
				new Person("ADE", "Valecha", "kolkata"), new Person("XYZ", "Zhingat", "Kalyan"),
				new Person("PQR", "Chetri", "Thane"));

		// Sorting on the basis of last name
		Collections.sort(listPerson, (p1, p2) -> (p1.getLname().compareTo(p2.getLname())));

		// Print all
		printConditionally(listPerson, (p) -> true);

		// Print person with fname name beginning with P
		printConditionally(listPerson, p -> p.getFname().startsWith("P"));

		// Print person with lname name beginning with P
		printConditionally(listPerson, p -> p.getLname().startsWith("Z"));

	}

	private static void printConditionally(List<Person> listPerson, Predicate<Person> predicate) {
		for (Person p : listPerson) {
			if(predicate.test(p))	System.out.println(p);
		}
	}

}