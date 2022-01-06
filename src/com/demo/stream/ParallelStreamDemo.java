package com.demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(10,"Nakul"));
		list.add(new Student(20,"Roy"));
		list.add(new Student(30,"Alin"));
		list.add(new Student(40,"Max"));
		
		Stream<Student> parallelStream = list.parallelStream();
		
		parallelStream.forEach(System.out::println);
		
		list.parallelStream().forEach(s -> doProcess(s));
	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}

}

class Student {

	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
