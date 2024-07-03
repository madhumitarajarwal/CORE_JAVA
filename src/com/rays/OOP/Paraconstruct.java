package com.rays.OOP;


public class Paraconstruct {
   String name;
   String address;
   int age;
   
   Paraconstruct(String name,String address,int age){
	   this.name=name;
	   this.address=address;
	   this.age=age;
   }
   
   public String getname() {
	   return name;
   }
   public  String getaddress() {
	   return address;
   }
   public int getage() {
	   return age;
   }
   
   public static void main(String[] args) {
		  Paraconstruct p = new Paraconstruct("madhu","preimium city",24);
		  
		   System.out.println("name" +p.getname());
		   System.out.println("address" +p.getaddress());
		   Paraconstruct p1=new Paraconstruct("priya","indore",21);
		   System.out.println("name" +p1.getname());
		   System.out.println("address" +p1.getaddress());
	  }



  
}




