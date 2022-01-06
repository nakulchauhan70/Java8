package com.demo.staticdefaultmethod;

public class Student implements Comparable<Student> {

	private String name;
	private Integer age;

	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student student) {
		return this.name.compareTo(student.getName());
	}

}
