package com.rays.OOP;

public class TestPerson {
	public static void main(String[] args) {

		Person data = new Person();
		data.setFullName("Madhumita");
		data.setCity("Indore");

		int age = data.findAge(2001, 8, 5);

		data.setAge(age);

		System.out.println("Name " + data.getFullName());
		System.out.println("city " + data.getCity());
		System.out.println("age  " + data.getAge());
	}
}
