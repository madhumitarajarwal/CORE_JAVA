package com.rays.javabasic;

public class Strinbuff {
 public static void main(String[] args) {
	 StringBuffer name= new StringBuffer("hello hii bye ");
	 System.out.println("append method "+name.append("nice to meet you"));
	 System.out.println("insert method"+name.insert(4,"gggg"));
	 System.out.println("delete method  "+name.delete(0,4));
	 System.out.println("reverse "+name.reverse());
	 System.out.println("capacity "+name.capacity());
 }
}
