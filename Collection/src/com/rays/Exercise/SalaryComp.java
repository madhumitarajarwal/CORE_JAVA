package com.rays.Exercise;

import java.util.Comparator;

public class SalaryComp implements Comparator<Employee> {
     public int compare(Employee o1,Employee o2) {
    	 return (int) (o1.getSalary()-o2.getSalary());
     }
}
