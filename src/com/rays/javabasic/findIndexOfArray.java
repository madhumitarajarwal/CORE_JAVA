package com.rays.javabasic;

public class findIndexOfArray {
	public static void main(String[] args) {
		int[] array= {1,2,30,4,50,6};
		int size=array.length;
		int temp=50;
		
		for(int i=0; i<size; i++) {
		if(array[i]==temp) {

			System.out.println("array index value of array are"+i);
		}	
		}
	}

}
