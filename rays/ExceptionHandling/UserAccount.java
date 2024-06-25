package com.rays.ExceptionHandling;

public class UserAccount {
      private   String userId="";
      private int age;
      private   double amount;
	private String record;
         UserAccount(){
        	// System.out.println("default parameter");
         }
         UserAccount(String userId ,double amount,int age){
        	 this.userId=userId;
        	 this.amount=amount;
        	 this.age=age;
        	
         }
         public double getAmount() {
        	 return amount;
         }
         public String getUserId() {
			return userId;
        	 }
         public int getAge() {
 			return age;
         	 }
         
         public double deposit(double TotalDeposit) {
        	 amount=amount+TotalDeposit;
        	 return amount;
         }
         public double withdraw(double TotalWithdraw) throws Error {
        	 if(TotalWithdraw>amount) {
        		 throw new Error("insufficient fund");
        	 }else {
        		 amount=amount-TotalWithdraw;
        		 //System.out.println(amount);
        		 return amount;
        	 }
         }
         public String record(String checkRecord) throws DuplicateRecordException {
        	 if(checkRecord == userId ) {
        		 throw new DuplicateRecordException("this record already exist !!");

        	}else {
        		   userId=checkRecord;
			       return userId;
        	 }
   
        	 }
         public int agecheck(int personage)throws AccessDenied {
        	 if(age<personage) {
        		 throw new AccessDenied("you are not eligible for bank account");
        	 }else {
        		 System.out.println("eligible for create account");
        		 return age;
        	 }
         }
         
        
        	 
         
      public static void main(String[] args) throws Error,DuplicateRecordException, AccessDenied {
    	  UserAccount u=new UserAccount("1234", 10000,20);
    	
    	
    	 System.out.println("welcome to account details");
    	 System.out.println("your user id are  "+u.getUserId());
    	 System.out.println("Balance  " + u.getAmount());
    	 System.out.println("total deposit  " +u.deposit(5000));
    	 System.out.println("after withdraw 1000 in account = " + u.withdraw(1000));
    	
    	 System.out.println("total amount  " + u.getAmount());
    	 System.out.println();
    	 System.out.println("check user Account unique id");
    	 System.out.println("check value " + u.record("1242"));
    	 
    	 System.out.println();
    	 System.out.println("check user age for eligible account creation or not");
    	 System.out.println(u.agecheck(15));
    	 
    	 
      }
	
	 
}

