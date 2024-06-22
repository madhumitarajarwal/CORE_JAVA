package com.rays.javabasic;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		String[] str = {"abc","efg"};
		
		System.out.println(str.length);
	
		if(str.length == 2){
			System.out.println("Hello " + str[1]);
		}
		else {
			System.out.println("else condition");
		}
		
	}
	
	
}

