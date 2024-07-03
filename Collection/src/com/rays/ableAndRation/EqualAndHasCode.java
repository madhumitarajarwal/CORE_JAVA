package com.rays.ableAndRation;

public class EqualAndHasCode {
   String name;
   Integer id;
   Integer salary;
   
   public EqualAndHasCode() {}
   public EqualAndHasCode(String name,int id,int salary) {
	   this.name=name;
	   this.id=id;
	   this.salary=salary;
   }
   public boolean equals(Object o) {
	   
	   EqualAndHasCode s=(EqualAndHasCode)o;
	  boolean b=this.name.equals(s.name)&& this.id.equals(s.id)&&this.salary.equals(s.salary);
	   return b;
   }
   public int hashCode() {
	  String i=this.name+this.id+this.salary;
	  return i.hashCode();
	   
   }
   
}
