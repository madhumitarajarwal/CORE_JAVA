package com.rays.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterList {
 public static void main(String[] args) {
	 List<String> l=new ArrayList<String>();
	 l.add("mita");
	 l.add("suman");
	 l.add("rekha");
	 System.out.println(l);
	 
	 //convert to upper
	 System.out.println("uppercase ");
	 l.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
	 
	 //convert  to lower
	 l.stream().map(i -> i.toLowerCase()).forEach(System.out::println);
	 //sorting
	 l.stream().sorted().forEach(System.out::println);
	 //sorting and upperCase
	 l.stream().sorted().map(i->i.toUpperCase()).forEach(System.out::println);
	 //duplicate value remove
	 l.stream().distinct();
	//start with s only 
	 l.stream().filter(e ->e.startsWith("s")).forEach(System.out::println);;
	 
 }}



