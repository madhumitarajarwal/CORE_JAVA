package com.rays.ExceptionHandling;

public class TestException {
      public static void main(String[] args) {
    	  int a=1;
    	  try {
    		  System.out.println(a/0);
    	  }catch(Exception e){
    		  System.out.println(e); 
    	  }
    	  
    	  //NullPointerException
    	  
    	  String b=null;
    	  try {
    		  System.out.println(b.length());
    	  }catch(NullPointerException e) {
    		  System.out.println(e);
    	  }
    	  
    	  String[] array= {"k","l","m"};
    	  try {
    		  System.out.println(array[4]);
    	  }catch(Exception e){
    		  System.out.println(e);
    	  }
    	  
      }
}
