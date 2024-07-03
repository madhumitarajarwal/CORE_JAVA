package com.rays.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateList {
     public static void main(String[] args) {
    	 List l=new ArrayList();
    	 l.add("hii");
    	 l.add("bye");
    	 l.add("hii");
    	 l.add("bye");
    	 l.add(3);
    	 
    	 System.out.println(l);
    	 Set s=new HashSet(l);
    	 System.out.println(s);
    	 
     }
}
