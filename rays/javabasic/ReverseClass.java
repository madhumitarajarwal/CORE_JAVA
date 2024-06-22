package com.rays.javabasic;
import java.util.Scanner;
public class ReverseClass {
  public static void main(String[] args){
	  int reverse=0;
	  int num;
	  Scanner num1=new Scanner(System.in);
	  System.out.println("please enter number which you want to reverse");
	   num=num1.nextInt();

	  
	 while(num!=0){  //123 //12 //1 //0 condition fail
		 
		 reverse=reverse*10;  //0*10=0  //30 //320
		 reverse=reverse+num%10; //3  //32  //321
		 num=num/10;//12 //1 //0
	 }
         System.out.println("output is"+reverse);
	  }
	 
  }

