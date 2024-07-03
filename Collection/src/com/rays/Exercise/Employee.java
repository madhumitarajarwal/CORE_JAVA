package com.rays.Exercise;

public class Employee {
      String name;
      int id;
      float salary;
      
      public Employee() {}
      
      public Employee(String name,int id,float salary) {
    	  this.name=name;
    	  this.id=id;
    	  this.salary=salary;
      }
      public String getName() {
    	  return name;
      }
      public int getId() {
    	  return id;
      }
      public float getSalary() {
    	  return salary;
      }
      public String toString() {
    	  return "[name= "+ name + "  id => " + id +  " salary = " +salary +"]";
      }
}
