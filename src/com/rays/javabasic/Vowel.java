package com.rays.javabasic;

public class Vowel {
	public static void main(String[] args) {
	String alpha ="abcdefghigklmnopqrstuvwxyz";
    int count=0;
	int i;
	for(i = 0; i <alpha.length();i++){
		
		char c=alpha.charAt(i);
		if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u') {
			count++;
			}
		}
	System.out.println("its vowels"+count);
	
	}
}
