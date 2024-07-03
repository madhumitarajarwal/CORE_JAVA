package com.rays.Exercise;

public class PersonName {
    String firstname;
    String lastname;
    
  public  PersonName(){}
  
  public PersonName(String firstname, String lastname) {
	  this.firstname=firstname;
	  this.lastname=lastname;
	}
  public String getFirstname() {
	  return firstname;
  }
  public String getLastname() {
	  return lastname;
  }
  public String toString() {
	  return firstname+"    "+lastname;
  }
  public boolean equals(Object o) {
	  PersonName p=(PersonName)o;
	  boolean b= this.firstname.equals(p.firstname)&&this.lastname.equals(p.lastname);
	  return b;
	  
  }
  
    
    
}
