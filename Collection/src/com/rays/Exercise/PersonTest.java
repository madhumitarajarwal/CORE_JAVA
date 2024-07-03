package com.rays.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest {
   public static void main(String[] args) {
	   List<PersonName>l=new ArrayList<>();
	   l.add(new PersonName("madhu","mita"));
	   l.add(new PersonName("madhu","mita"));
	   
	   PersonNameCheck name=new PersonNameCheck();
	   Collections.sort(l,name);
	   for(PersonName p:l) {
		   System.out.println(p);
	   }
	   
	   
   }
}
