package com.rays.DataAbstraction;

public class BusinessMan extends Person {
   private int salary;
   private int donateAmount;
   private int total;
   BusinessMan(){
	   
   }
   public int getSalary() {
	   return salary;
   }
   public void setSalary(int salary) {
	   this.salary=salary;
   }
   public int getdonateAmount() {
	   return donateAmount;
   }
   public void setdonateAmount(int donateAmount) {
	   this.donateAmount=donateAmount;
   }
   public double getTotal() {
	   return total;
   }
   public void setTotal(int total) {
	   this.total=total;
   }
	public int donation() {
		//System.out.println(donateAmount+"total amount"+ salary );
	return total=salary-donateAmount;

	}
}
 