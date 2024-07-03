package com.rays.ExceptionHandling;

public class UnCheck {

	public static void main(String[] args) {
           dad();
	}
		private static  void dad() {
			try {
				mom();
			}catch(RuntimeException e) {
				System.out.println("mistake made by son,catch by dad "+e);
			}
		}
		private static void mom() {
			
				son();
		}
		private static void son() {
			throw new RuntimeException("mistake..");
		}
	}
