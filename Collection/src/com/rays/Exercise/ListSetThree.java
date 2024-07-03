package com.rays.Exercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListSetThree {
  public static void main(String[] args) {
	  Set<Integer> s=new HashSet<Integer>();
	 for(int i=0;i<=10;i++) {
		 s.add(i);
	 }
	 System.out.println("using hashset ="+s);
	 Set<Integer> t=new TreeSet<Integer>();
	 for(int e=0;e<=10;e++) {
		 t.add(e);
	 }
	 System.out.println("using treeset ="+t);
	 LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
	 for(int f=0;f<=10;f++) {
		 h.add(f);
	 }
	 System.out.println("using Linkedhasset ="+h);
  }
}
