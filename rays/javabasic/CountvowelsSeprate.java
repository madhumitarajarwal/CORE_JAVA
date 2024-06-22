package com.rays.javabasic;

import java.util.Scanner;

public class CountvowelsSeprate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter user name");

		String myString = sc.next();

		System.out.println("myString = " + myString);

		int count = 0;


			for (int j = 0; j < myString.length(); j++) {

				if ('a' == myString.charAt(j) || 'e' == myString.charAt(j)) {

					count++;

				}
				
				if (count != 0) {
					System.out.println(myString.charAt(j) + "=" +  count);
					count = 0;
				}

			}
			
			
		
	}

}
