package com.rays.OOP;

public class Encapsulation {

	public void SaySomething() {
		System.out.println("hello students");
	}

	public static void Say() {
		System.out.println("hello rays");
	}

	public int sum() {

		int a = 10;
		int b = 20;
		int c = a + b;

		return c;

	}

	public static void main(String[] args) {

		Encapsulation e = new Encapsulation();
		e.SaySomething();
		System.out.println(e.sum());
		Encapsulation.Say();

	}

}
