package com.rays.javabasic;
import java.util.Scanner;

public class IDPassword {
  public static void main(String[] args){
	  Scanner myEmail=new Scanner(System.in);
	  Scanner myName=new Scanner(System.in);
	   System.out.println("please enter mail");
	       String email= myEmail.next();
	    System.out.println("please enter name");
	       String name= myName.next();
	     
	  if(!(name==""&& email=="")){
		  System.out.println("you login happyy");
	  }
	  //else if(email=="madhuraj@gmail.com && name==""){
		//System.out.println("you logIn suucessfuly");
		  
	//  }
	  
  }
}
