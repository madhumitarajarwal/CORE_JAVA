package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetClass {
   public static void main(String[] args) {
	   SortedSet s= new TreeSet();
	   s.add("J");
	   s.add("G");
	   s.add("F");
	   
	   System.out.println("value one ="+s.first());
	   System.out.println("value last =" +s.last()); 
	   
	   for(Object ele:s) {
		   System.out.println(ele);
	   }
	  
	   
   }
}
