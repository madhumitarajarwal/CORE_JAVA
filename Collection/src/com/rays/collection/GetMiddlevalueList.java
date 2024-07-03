package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class GetMiddlevalueList {
   public static void main(String[] args) {
	   List l=new ArrayList();
	   l.add(2);
	   l.add(4);
	   l.add("hey");
	   l.add('a');
	   l.add(8);
	   System.out.println(l);
	   System.out.println(l.get(l.size()-2));
   }
}
