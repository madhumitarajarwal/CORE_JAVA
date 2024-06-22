package com.rays.javabasic;

public class StringMethod {
	public static void main(String[] args) {
		String name = " madhumita Rajariwal ";
		System.out.println("length" + name.length());
		System.out.println("charAt method" + name.charAt(6));
		System.out.println("lastindexOf method" + name.lastIndexOf("i"));
		System.out.println("indexOf method" + name.indexOf("mita"));
		System.out.println(" indexOf 'i' method" + name.indexOf("i"));
		System.out.println("replace method" + name.replace("a", "g"));
		System.out.println("toLowerCase method" + name.toLowerCase());
		System.out.println("toUpperCase method" + name.toUpperCase());
		System.out.println("substring  " + name.substring(6));// mita rajarwal
		System.out.println("trim" + name.trim());
		String[] str = name.split(" ");
		System.out.println(str[0]);
		System.out.println(str[1]);

		System.out.println(str.length);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);

		}
	}

}
