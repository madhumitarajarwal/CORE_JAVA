package com.rays.javabasic;

public class OddAverage {
     public static void main(String[] args){
    	 int[]i= {1,2,3,4,5,6,7,8,9,10};
    	 
    	 for(int n:i) {
    	 if(n%2!=0) {
    		 System.out.println("it's odd"+n);
    	 }else {
    		 System.out.println("it's even"+n);
    	 }
    	 
    	 
    	 int avrg=n*n/10;
    	 System.out.println("average of number are"+avrg);
    	 }
     }
}
