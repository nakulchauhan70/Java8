package com.demo.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main7 {

	public static void main(String[] args) {

		List<Person> listPerson = Arrays.asList(
				new Person("ABC","Kukreja","Mum"),
				new Person("ADE","Valecha","kolkata"),
				new Person("XYZ","Zhingat","Kalyan"),
				new Person("PQR","Chetri","Thane")
				);
		
		//Sorting on the basis of last name
		Collections.sort(listPerson, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLname().compareTo(p2.getLname());
			}
		});
		
		//Print all
		printAll(listPerson);
		
		//Print person with fname name beginning with P
		printNameWithBeginningC(listPerson);
	}

	private static void printNameWithBeginningC(List<Person> listPerson) {
		for(Person p : listPerson) {
			if(p.getFname().startsWith("p")) System.out.println(p);
		}
	}

	private static void printAll(List<Person> listPerson) {
		for(Person p : listPerson) {
			System.out.println(p);
		}
	}

}
