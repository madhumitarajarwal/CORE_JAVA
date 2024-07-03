package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
   public static void main(String[] args) {
	   Set s=new HashSet();
	   s.add("hii");
	   s.add("bye");
	   s.add(1);
	   s.add(2);
	   s.add("hii");
	   System.out.println(s);
   }
}
