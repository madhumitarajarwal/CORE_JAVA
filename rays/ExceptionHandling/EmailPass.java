package com.rays.ExceptionHandling;

public class EmailPass {
    public static void main(String[] args) {
    	String email="madhu@gmail.com";
    	String pasWrd="1234";
    	
    	try {
    		if(pasWrd!=null && email == "madhu@gmail.com") {
    			System.out.println("happily login");
    		}else {
    			throw new RuntimeException("email not exist") ;
    				
    			
    			}
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    }
}
