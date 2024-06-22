package com.rays.javabasic;

public class ArrayMax {
	
	public static void main(String[] args) {
  int[] array={2,4,8,1,9,10,14,0};
  int max = array[0];
  for(int i = 0;i < array.length;i++){
	  if( array[i] > max) {
		  max=array[i];
	  }
	  
	 
  }
  
  System.out.println("total max value are"+max);
	}
  
}
