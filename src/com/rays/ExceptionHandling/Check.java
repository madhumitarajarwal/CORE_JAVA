package com.rays.ExceptionHandling;

public class Check {
     public static void main(String[] args) {
    	 dad();
     }
     private static void dad() {
    	 try {
    		 mom();
    	 }catch(Exception e) {
    		 System.out.println("mistake made by son,catch by dad "+e);
    	 }
     }
     private static void mom()throws Exception{
    	 son();
     }
     private static void son() throws Exception{
    	 throw new Exception("mistake");
     }
}
