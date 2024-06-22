package com.polymorphism;

public abstract class UserName {

	public abstract void userData();

	public void donation() {
		System.out.println("please enter donate amount");
	}

}

class User1 extends UserName {

	@Override
	public void userData() {
		// TODO Auto-generated method stub
		System.out.println("this is my user1 class");
	}

	public static void main(String[] args) {

		UserName us = new User1();
		
		us.userData();

	}

}
