package com.inter.abs.io;

public class TestDonation {
     public static void main(String[] args) {
    	 BusinessMan b=new BusinessMan();
    	 b.setSalary(1238900);
    	 b.setdonateAmount(2300);
    	 
    	 System.out.println("salary"+b.getSalary());
    	 System.out.println("donate amount"+b.getdonateAmount());
    	 System.out.println("total amount businessMan has   " +b.donation());
    	 b.donation();
     }
}
