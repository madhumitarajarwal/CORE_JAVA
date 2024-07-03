package com.rays.ableAndRation;

public class Employee {
	int id;
	String name;
	int salary;
	
	
    public Employee() {}
    
    public Employee(int id,String name,int salary) {
    	this.id=id;
    	this.name=name;
    	this.salary=salary;
    }
    public int getId() {
    	return id;
    }
    public String getName() {
    	return name;
    }
    public int getSalary() {
    	return salary;
    }
    public String toString() {
    	return "Employee [ id =" +id+ "name ="+name+ "salary"+salary+"]";
    }
    
}
