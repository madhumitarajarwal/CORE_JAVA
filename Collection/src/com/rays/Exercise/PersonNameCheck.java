package com.rays.Exercise;

import java.util.Comparator;

public class PersonNameCheck implements Comparator<PersonName>{
	public int compare(PersonName p1,PersonName p2) {
		
		return p1.getFirstname().compareTo(p2.lastname);
	}
   
}
