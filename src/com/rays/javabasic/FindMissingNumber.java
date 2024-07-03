package com.rays.javabasic;



public class FindMissingNumber {
	public static void main(String[] args) {
   int[] A= {10,20,30,40,50};
   int[] B= {10,20,30,40};
   int suma=0;
   int sumb=0;
   int temp3=0;
  for(int i=0;i<A.length;i++) {
	  suma+=A[i];
  }
for(int j=0; j<B.length;j++) {
		  sumb+=B[j];
	  }
temp3=suma-sumb;
System.out.println("missing number are "+temp3);
}
	
		
}