package com.rays.ableAndRation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComprater {
   public static void main(String[] args) {
	   List<Employee> l=new ArrayList<Employee>();
	   
	   l.add(new Employee(3,"sonam",4500));
	   l.add(new Employee (1,"neha",2100));
	   l.add(new Employee(2,"priya",23000));
	   
	   TestCompraterbyId id=new TestCompraterbyId();
	   Collections.sort(l,id);
	   for(Employee e:l) {
		  System.out.println(e); 
	   }
   }
}
