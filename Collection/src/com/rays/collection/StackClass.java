package com.rays.collection;

import java.util.Stack;
//Last in fast out
public class StackClass {
     public static void main(String[] args) {
    	 Stack s = new Stack();
    	 for(char i='a';i<='z';i++) {
    		 s.push(i);
    	 }
    	 System.out.println(s);
    	 Stack s1=new Stack();
    	 while(!s.isEmpty()) {
    	 s1.push(s.pop());
    	 
    	 }
    	 System.out.println(s1);
    	 System.out.println(s1.peek( ));
    	 System.out.println(s1);
     }
}
