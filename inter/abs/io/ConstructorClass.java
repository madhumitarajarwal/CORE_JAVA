package com.inter.abs.io;

public class ConstructorClass {
	int a;
	int b;
	String name;
	
	ConstructorClass(){
		System.out.println("this is default constructor");
	}
	ConstructorClass(int a,int b){
		this();
		this.a=a;
		this.b=b;
		System.out.println("value of a"+a);
		System.out.println("value of b"+b);
	}
	ConstructorClass(int a,int b, String name){
		this(a, b);
		this.name=name;
		System.out.println("value of name"+name);
	} 

}
