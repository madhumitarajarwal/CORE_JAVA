package com.rays.javabasic;

public class Armstrong {
public static void main(String[] args) {
	int num=153,r;
	int temp=num;
	int sum=0;
   while(temp!=0){
	  r=temp%10;
	  sum=(sum+r*r*r);
	  temp=temp/10;
   }
	System.out.println("sum ="+sum);
	if(sum==num) {
		System.out.println("this is armstrong number");
	}else {
		System.out.println("this is not armstrong");
	}
}
}

