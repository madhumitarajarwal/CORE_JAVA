package com.rays.ableAndRation;

public class TestEqualHasCode {
  public static void main(String[] args) {
	  EqualAndHasCode s1=new EqualAndHasCode("rays",50,100);
	  EqualAndHasCode s2=new EqualAndHasCode("rays",50,100);
	  
	  System.out.println(s1.equals(s2));
	  System.out.println(s1.hashCode());
	  System.out.println(s2.hashCode());
  }
}
