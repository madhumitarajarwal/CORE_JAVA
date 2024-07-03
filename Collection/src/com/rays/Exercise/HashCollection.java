package com.rays.Exercise;

public class HashCollection {
     String employename;
     Integer age;
     
    public  HashCollection(){}
     public  HashCollection(String employename,int age){
    	 this.employename=employename;
    	 this.age=age;
     }
    	 public String toString() {
    		  return employename+"    "+age;
    	  }
    	 
    	 public boolean equals(Object o) {
    		 HashCollection h =(HashCollection)o;
    		 boolean s=this.employename.equals(h.employename)&&this.age.equals(h.age);
    		 return s;
    	 }
    	 public int HashCode() {
    		 String key=this.employename+this.age;
    		 return key.hashCode();
    	 }
     }

