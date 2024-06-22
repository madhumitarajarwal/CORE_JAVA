package com.rays.javabasic;

public class sumOf7 {
 public static void main(String[] args) {
	 int sum=0;
	 for(int i=100;i<=200;i++) {
		 if(i%7 == 0) {
			 sum=sum+i;
		 }
	 }
	 System.out.println("total sum of number whose divisible by 7"+sum);
 }
}
