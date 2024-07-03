package com.rays.Exercise;

public class TestHashCollection {
   public static void main(String[] args) {
	   HashCollection c=new HashCollection("madhu",24);
	   HashCollection c1=new HashCollection("madhu",24);
	   
	  System.out.println(c.equals(c1));
	  System.out.println(c.HashCode());
	  System.out.println(c1.HashCode());
	 
   }
	 
}
