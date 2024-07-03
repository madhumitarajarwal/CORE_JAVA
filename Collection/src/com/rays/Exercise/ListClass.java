package com.rays.Exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListClass {
   public static void main(String[] args) {
	   List<String> l=new ArrayList<>();
	   l.add("one");
	   l.add("two");
	   l.add("3");
	   System.out.println(l);
	   System.out.println("After Iterate elements");
	   
	   Iterator<String> i= l.iterator();
	   while(i.hasNext()) {
		   String n=(String) i.next();
		   System.out.println(n);
	   }
   }
}
