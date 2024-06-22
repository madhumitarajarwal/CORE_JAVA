package com.rays.javabasic;

public class SecondLargestArray {
	public static void main(String[]args) {
		int[] array= {1,6,7,3,88,93,56,78,100};
		int size=array.length;
		int secndlarge;
		for(int i=0; i<size; i++){
			for (int j=i+1; j<size; j++) {
			if(array[i]>array[j])
			{
				secndlarge=array[i];
				array[i]=array[j];
				array[j]=secndlarge;
				
			}
				
			}
			
		}
		int output=array[size-2];
		System.out.println("2nd largest element are "+output);
	}

}
