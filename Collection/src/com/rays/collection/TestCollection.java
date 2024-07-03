package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
  public static void main(String[] args) {
	  
	  Collection c= new ArrayList();
	  c.add(5);
	  c.add('c');
	  c.add(9.0);
	  c.add(true);
	  
	  System.out.println("all element ="+c);
	  System.out.println(" c conatins ="+c.contains(9.0));
	  
	  Collection c1=new ArrayList();
	  c1.add(7);
	  c1.add('a');
	  c1.add("madhu");
	  c1.add(1.0);
	  c1.add(false);
	  System.out.println(c1 +" c or c1="+c);
	  c1.remove(1.0);
	  System.out.println(c1);
	  c.retainAll(c1);
	  System.out.println(c);
	  
  }
}
