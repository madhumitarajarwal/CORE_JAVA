package com.rays.javabasic;

public class CheckStrngPalindrom {
	public static void main(String[] args) {
		String name = "madam";
		String check = "";

		for (int i = 0; i < name.length(); i++) {
			check = name.charAt(i) + check;
		}
		
		System.out.println(check);
		
		if (name.equals(check)) {
			System.out.println("it's palindrom");
		} else {
			System.out.println("it's not palindrom");
		}
	}
}
