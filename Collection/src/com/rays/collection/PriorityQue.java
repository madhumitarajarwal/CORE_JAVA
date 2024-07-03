package com.rays.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQue {
   public static void main(String[] args) {
	   Queue q=new PriorityQueue();
	   q.offer("hii");
	   q.offer("byee");
	   q.offer("1");
	   System.out.println(q);
	   
	   //Examine top element 
	   Object ele= q.element();
	   System.out.println(ele);
	   
	 //using poll method 
	   
	  Object p = q.poll();
	  System.out.println("poll elements in queue "+p);
	  
	//using peek method 
	   
	  Object p1 = q.poll();
	  System.out.println("peek elements in queue "+p1);
	  
	  
	  
	  
	//access via iterator
	   Iterator it=q.iterator();
	    
	   while(it.hasNext()) {
		   String s=(String) it.next();
		   System.out.println(s);
		   
	   }
	   
	   
   }
}
