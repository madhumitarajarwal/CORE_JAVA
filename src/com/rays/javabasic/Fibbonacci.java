package com.rays.javabasic;
import java.util.Scanner;
public class Fibbonacci {
	public static void main(String[] args) {
	int n,first=0,second=1,next=0,c;
	System.out.println("please enter value");
	Scanner num=new Scanner(System.in);
	   n=num.nextInt();
	
		for(c=0;c<n;c++) {
			if(c<=1) {
			next=c;
			}
	        else {
				next=first+second;  
				first=second;   
				second=next;
				}
			System.out.println("the output of series are"+ next); 
			
		}
		
		
		
	}

}
