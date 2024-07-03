package com.rays.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueLinkedLit {
   public static void main(String[] args) {
	   Queue q= new LinkedList();
	   q.add("hii");
	   q.offer(2); 
	   q.add("bye");
	   q.offer(1);

	   System.out.println(q);
	   
	   //peek
	  Object l= q.peek();
	   System.out.println("after peek "+l);
	   
	   Iterator i= q.iterator();
	   
	   while(i.hasNext()) {
		   Object o= i.next();
		  
		   System.out.println(o);
	   }
	   
   }
}
