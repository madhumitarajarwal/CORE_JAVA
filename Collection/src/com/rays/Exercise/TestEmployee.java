package com.rays.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
    	List<Employee> l=new ArrayList<>();
    	l.add(new Employee("madhu",3,21000));
    	l.add(new Employee("mita",2,2000));
    	l.add(new Employee("rama",4,1000));
    	l.add(new Employee("radha",1,200));
    	
    	SalaryComp s=new SalaryComp();
    	Collections.sort(l,s);
    	for(Employee e:l) {
    		System.out.println(e);
    	}
    }
}
