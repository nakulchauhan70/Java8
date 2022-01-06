package com.demo.staticdefaultmethod;

import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		StudentInterface studentInterface = new MyClass();
		
		List<Student> studList = Arrays.asList(new Student("Zakul", 20), new Student("Rahul", 25), new Student("Vijay", 30));
		
		studList = studentInterface.sortStudent(studList);
		studList.forEach(System.out::println);
		
		StudentInterface.greet("NAKUL");
		
		System.out.println(studentInterface.getMaxNum(Arrays.asList(10,20,30,2000,50,60)));
	}

}
