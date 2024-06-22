package com.rays.javabasic;
import java.util.Scanner;
public class Palindrom {
	public static void main(String[] args) {
	 Scanner num1=new Scanner(System.in);
	 System.out.println("please enter number so i can check it's palindrom or not");
		
		int num=num1.nextInt();
		
		int temp=num;
		int rev=0;
		while(temp!=0) {
			rev=rev*10;
			rev=rev+temp%10;
			temp=temp/10;
		}
		
		if(num==rev) {
			System.out.println("congratulation!its palindrom number "+ num);
		}else {
			System.out.println("oops! it's not palindrom number " +num);
		}
	}

}
