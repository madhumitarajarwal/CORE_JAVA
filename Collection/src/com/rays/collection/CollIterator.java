package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollIterator {
	public static void main(String[] args) {
		Collection c =new ArrayList();
		 c.add(5);
		  c.add('c');
		  c.add(9.0);
		  c.add(true);
		  System.out.println(c);
		  
		  Iterator it=c.iterator();
		  while(it.hasNext()) {
			  Object o=(Object) it.next();
			  System.out.println(o);
		  }
	}

}   
