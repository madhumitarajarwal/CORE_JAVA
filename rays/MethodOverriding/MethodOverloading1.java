package com.rays.MethodOverriding;

public class MethodOverloading1 {
   public int sum(int a, int b) {
	   return a+b;
   }
   public double sum(double a, double b) {
	   return a+b;
   }
   public int sum(int a,int b,int c) {
	   return a+b+c;
   }
   public static void main(String[] args) {
	   MethodOverloading1 m =new MethodOverloading1();
	   System.out.println( m.sum(2,3));
	   System.out.println(m.sum(3.4, 3.1));
	   System.out.println( m.sum(2,3,4));
   }
}
