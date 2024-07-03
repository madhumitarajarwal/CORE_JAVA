package com.rays.javabasic;

public class FindVowelName {
   public static void main(String[] args) {
	   String name="MY NAME IS MADHUMITA RAJARWAL";
	   int count=0;
	  String naM= name.toLowerCase();
	   
	   for(int i=0; i < naM.length();i++) {
		  char find = naM.charAt(i);
		
		  if(find=='a'|| find=='e'|| find=='i' || find=='o' || find=='u') {
		      count++;
			  
		  }
	   }
	   System.out.println("total vowels are"+count);
   }
}
