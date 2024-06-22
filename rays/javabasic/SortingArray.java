package com.rays.javabasic;

public class SortingArray {
	public static void main(String[]args) {
		int[] array= {80,90,10,40,20,100,30,50,60,70};
		int size = array.length;
		int temp=0;
		
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				
				if(array[i] > array[j]) {
					
				temp=array[i];  //90 //40 //100
				array[i]=array[j];//10 //20 //30
				array[j]=temp;//90 //40 //100
			}
			}
			System.out.print( " "+array[i]);
			
		}
		
	}
	

}
