package com.rays.ableAndRation;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
   public static void main(String[] args) {
	  List <ComparableClass> l =new ArrayList<ComparableClass>();
	   l.add(new ComparableClass( "madhu",2));
	   l.add(new ComparableClass("piyush",1));
	   l.add(new ComparableClass("mita",3));
	   l.add(new ComparableClass("alka",5));
	   l.add(new ComparableClass("chetna",4));
	   
	   Collections.sort(l);
	   for(ComparableClass i:l) {
		   System.out.println(i);
	   }
   }
}
