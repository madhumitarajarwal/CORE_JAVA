package com.rays.ExceptionHandling;

public class EvnOdd {
	public static void main(String[] args) {
		int a = 1;
		try {
			if (a % 2 == 0) {
				System.out.println("its even ");
			} else {
				throw new RuntimeException("number is not even");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
