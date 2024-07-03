package com.rays.OOP;

public class BankAccountData {
  public static void main(String[] args) {
	  
	   BankAccount d=new BankAccount();
	   
	  d.setAccountNum(45643);
	  d.setAccountType("Saving A/c");
	  d.setavailableBal(3456);
	  
	 
	 System.out.println("Customer Account =" +d.getAccountNum());
	 System.out.println("Account Type = "+d.getAccountType());
	 System.out.println("Total Amount = "+d.getavailableBal());
	 d.deposite(1234560);
	 System.out.println("After Deposite = "+d.getavailableBal());
	 d.withdraw(3456); 
	 System.out.println("After WithDraw = "+d.getavailableBal());
	   
	   
	 
  }
}
