package com.rays.javabasic;

public class MaxNumber {
	public static void main(String[] args){
    int a=10,b=20,c=30;
    if((a>b)&&(a>c)){
    	System.out.println("a is maximum"+a);
    }else if((b>a)&&(b>c)) {
    	System.out.println("b is maximum"+b);
    }
    else {
    	System.out.println("c is maximum " +c);
    }
}
}