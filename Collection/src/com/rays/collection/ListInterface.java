package com.rays.collection;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
//import java.util.Collection;

public class ListInterface {
    public static void main(String[] args) {
    	List a= new ArrayList();
    	a.add("hii");
    	a.add(1);
    	a.add(2.3);
    	a.add(null);
    
    	
    
    	
    	//iterate each elements using list interface
    	
    	ListIterator lit=a.listIterator();
    	while(lit.hasNext()) {
    	Object o=lit.next();
    	System.out.println("iterator   " +o);
    }
    	
    	
    	a.add(3, "bye");
    	System.out.println("====" + a);
    	System.out.println("remove element in given index 2 = "+a.remove(2));
    	System.out.println("===== " + a);
    	System.out.println("replace the element in given index ="+a.set(2, "setreplace"));
    	System.out.println(a);
    	System.out.println("element of 3rd index are " +a.get(3));
    	//System.out.println(a.subList(2, 4));
    	System.out.println("indexOf "+a.indexOf("bye"));
    	System.out.println("last indexof =" + a.lastIndexOf("hii") );
    	
    	System.out.println(a);
    	
    	
}
}
