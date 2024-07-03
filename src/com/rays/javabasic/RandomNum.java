package com.rays.javabasic;

public class RandomNum {
	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			double d= Math.random()*10;
			int a=(int)d;
			System.out.println("5 random value are"+a);
		}
	}

}
