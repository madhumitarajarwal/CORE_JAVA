package com.rays.ableAndRation;

public class EmployeeShortBySalary implements Comparator<Employee> {
   
	public int compare(Employee o1,Employee o2) {
//		if (o1.getSalary() == o2.getSalary()) {
//
//			return 0;
//
//		} else if (o1.getSalary() > o2.getSalary()) {
//
//			return 1;
//
//		} else {
//			
//			return -1;
//		
//		}
		return o1.getSalary()-o2.getSalary();
	}
}
