package com.demo.staticdefaultmethod;

import java.util.Collections;
import java.util.List;

public interface StudentInterface {

	default public List<Student> sortStudent(List<Student> studentList) {
		Collections.sort(studentList);

		return studentList;
	}

	static public void greet(String name) {
		System.out.println("Welcome " + name);
	}
	
	Integer getMaxNum(List<Integer> intList);
}
