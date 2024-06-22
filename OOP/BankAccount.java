package com.OOP;

public class BankAccount {
    int AccountNum =0;
    String AccountType = "";
    double availableBal =0;
    
    public int getAccountNum() {
    	return AccountNum;
    }
    public void setAccountNum(int AccountNum) {
    	this.AccountNum=AccountNum;
    }
    public String getAccountType() {
    	return AccountType;
    }
    public void setAccountType(String AccountType) {
    	this.AccountType=AccountType;
    }
   
    public double getavailableBal() {
    	return availableBal;
    }
    public void setavailableBal(double availableBal) {
		this. availableBal=availableBal;
    }
    
    public double deposite(double depositeAmount) {
    	return availableBal=availableBal+depositeAmount;
    }
    public double withdraw(double withdrawAmount) {
    	return availableBal=availableBal-withdrawAmount;
    }

    }

