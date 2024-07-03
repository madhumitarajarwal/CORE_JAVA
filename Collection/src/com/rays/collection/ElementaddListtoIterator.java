package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElementaddListtoIterator {
   public static void main(String[] args) {
	   List l=new ArrayList();
	   l.add(3);
	   l.add('2');
	   l.add(24);
	   l.add(80);
	   System.out.println(l);
	   
	   Iterator i=l.iterator();
	   l.add(100);
	   while(i.hasNext()) {
		   Object o= i.next();
		   System.out.println(o);
		   
	   }
   }
}
