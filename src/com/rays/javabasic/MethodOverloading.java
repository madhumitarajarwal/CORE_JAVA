package com.rays.javabasic;

public class MethodOverloading {

	public static void SaySomething() {
		System.out.println("hello madhumita mam");
	}

	public static int SaySomething(int a, int b) {

		int c = a + b;
		System.out.println("sum=" + c);
		return c;

	}

	public static int SaySomething(int a, int b, int c) {

		int d = a + b + c;
		System.out.println("your sum is=" + d);

		return d;

	}

	public static void main(String[] args) {

		MethodOverloading.SaySomething();
		MethodOverloading.SaySomething(10, 20);
		MethodOverloading.SaySomething(10, 20, 30);

	}

}
