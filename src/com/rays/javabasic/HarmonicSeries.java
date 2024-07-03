package com.rays.javabasic;

public class HarmonicSeries {
	public static void main(String[] args) {
  int[] array= {1,2,3,4,5,6,7,8,9,10};
  int size=array.length;
  double temp=0;
 
  for(int i=0; i<size; i++) {
	if(array[i]!=0) {
		temp+=(double)1/array[i];
		 
	 
	}
	System.out.println("1/"+array[i]);
	System.out.println(temp);
  }
 
  
}
}

