package com.rays.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueClass {
   public static void main(String[] args) {
	   Queue<String> q = new ArrayBlockingQueue<>(2);
	   System.out.println("queue add => ");
	   try {
		   q.add("a");
		   q.add("b");
		   q.add("c");
		 }catch(Exception e){
			 System.out.println("Exception "+e.getMessage());
		 }
	   q.clear();
	   System.out.println("queue offer =>");
	   try {
		   q.offer("a");
		   q.offer("b");
		   q.offer("c");
		   
	   }catch(Exception e) {
		   System.out.println("Exception "+e.getMessage());
	   }
	   q.clear();
	   System.out.println("queue remove =>");
	   try {
		   q.remove();
		   System.out.println("queue");
	   }catch(Exception e) {
		   System.out.println("Exception "+e.getMessage()); 
	   }
	   q.clear();
	   System.out.println("queue poll =>");
	   try {
		   q.poll();
		   System.out.println("queue");
	   }catch(Exception e) {
		 System.out.println("Exception "+e.getMessage());  
	   }
	   q.clear();
	   System.out.println("queue element=>");
	   try {
		   q.element();
		   System.out.println("queue");
	   }catch(Exception e) {
		   System.out.println("Exception "+e.getMessage());
	   }
	   q.clear();
	   System.out.println("queue peek=>");
	   try {
		   q.peek();
		   System.out.println("queue");
	   }catch(Exception e) {
		   System.out.println("Exception "+e.getMessage());
	   }
	   q.clear();
   }
}
