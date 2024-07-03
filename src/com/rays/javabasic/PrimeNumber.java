package com.rays.javabasic;

public class PrimeNumber {
public static void main(String[] args) {
	
	int num=6,i,count=0;
	
	
	for(i=2;i<num;i++) {
		if(num%i==0) {
			count++; 
		}
	}
	if(count == 0){
		System.out.println(" prime number");
	}
	else {
		System.out.println("it's not prime");
	}
	
	
}
}
