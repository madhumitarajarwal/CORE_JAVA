package com.rays.ableAndRation;

import java.util.Comparator;

public class EmployeeShortByIdNamSaralary implements Comparator<Employee>{
   
	public int compare(Employee o1,Employee o2) {
		if(o1.getId()==o2.getId() || o1.getName()==o2.getName()) {
			return o1.getSalary()-o2.getSalary();
		}else if (o1.getId()==o2.getId()) {
			return o1.getName().compareTo(o2.getName());
		}else {
			return o1.getId()-o2.getId();
		}
	}
}
