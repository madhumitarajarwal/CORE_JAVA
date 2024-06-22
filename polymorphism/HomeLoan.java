package com.polymorphism;

public class HomeLoan {
	public static void main(String[] args) {
	Bank[] banks=new Bank[2];
	
	banks[0]=new HDFC();
	banks[1]=new SBI();
	LoanEnquiry(banks); 
	
}

	private static void LoanEnquiry(Bank[] banks) {
		// TODO Auto-generated method stub
		for(Bank b:banks) {
			String name=b.getName();
			double rate=b.intrest();
			System.out.println(name + " "+ rate);
		}
	}
}
