package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorVector {
  public static void main(String[] args) {
	  Vector v=new Vector();
	  
	  v.add(44);
	  v.add('a');
	  v.add("hi");
	  System.out.println(v);
	  
	Enumeration e=v.elements();
	v.add('s');
	while(e.hasMoreElements()) {
		Object o=(Object)e.nextElement();
		System.out.println(o);
	}
	  
	  
  }
}
