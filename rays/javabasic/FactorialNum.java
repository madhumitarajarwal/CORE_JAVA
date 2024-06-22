package com.rays.javabasic;
import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) {
		Scanner val=new Scanner(System.in);
		System.out.println("please enter number");
		int scan=val.nextInt();
	  int i,fact=1;

	  for(i=1;i<=scan;i++) {
		 fact=fact*i;
	  }
	  System.out.println("factorial number of 5 is" + fact);
	}

}
