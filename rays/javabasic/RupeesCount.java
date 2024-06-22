package com.rays.javabasic;

public class RupeesCount {
    public static void main(String[] args) {
    	int note1=45200;
    	int[] notes= {2000,500,100,50,20,10,5,2,1};
    	int count=0;
    	
    	for(int i=0; i<notes.length;i++) {
    		count=note1/notes[i];
    		if(count>0) {
    			System.out.println(notes[i]+" = "+count);
    		}
    		note1=note1% notes[i];
    	}
    }
}
