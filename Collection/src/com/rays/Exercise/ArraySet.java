package com.rays.Exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ArraySet {
	public static void main(String[] args) {
   ArrayList<Integer> l=new ArrayList<>();
   for(int i=0;i<100000;i++) {
	l.add(i);
   }
   System.out.println(l);
   HashSet<Integer> s=new HashSet<Integer>(l);
   //random
  Random r=new Random();
  int[] randomInt=new int[50];
  for(int i=0; i<50; i++) {
	  randomInt[i]=r.nextInt(100000);
  }
 long startTime=System.nanoTime();
  for(int num:randomInt) {
	 l.contains(num);
  }
  long endTime=System.nanoTime();
  for(int num:randomInt) {
	  s.contains(num);
  }
 
  startTime=System.nanoTime();
  for(int num:randomInt) {
	  s.contains(num);
  }
  
  endTime=System.nanoTime();
  long hashSetSearch=endTime-startTime;
  
  startTime=System.nanoTime();
  for(int num:randomInt) {
	  l.contains(num);
  }
  
  endTime=System.nanoTime();
  long ArraylistSearch=endTime-startTime;
  
  
  System.out.println("in hashset array time "+hashSetSearch);
  System.out.println("arraylist in search "+ArraylistSearch);
	}
	 
	   
}
