package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeList {
   
    	String name;
    	int salary;
    	
    	EmployeList(String name,int salary){
    		this.name=name;
    		this.salary=salary;
    	}
    	public String getName() {
    		return name;
    	}
    	public int getSalary() {
    		return salary;
    	}
    	 public static void main(String[] args) {
    		 EmployeList e=new  EmployeList("madhu",120000);
    		 EmployeList e1=new  EmployeList("chetna",340000);
    		 
    		 List l=new ArrayList();
    		 l.add(e);
    		 l.add(e1);
    		 
    		 Iterator i=l.iterator();
    		 while(i.hasNext()) {
    			
    			EmployeList	emp=(EmployeList)i.next();
    			System.out.println(emp.getName());
    			}
    		 }
    		 
    	 }
    

