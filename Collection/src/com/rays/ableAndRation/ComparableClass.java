package com.rays.ableAndRation;

public class ComparableClass implements Comparable<ComparableClass> {
   
    	private String name;
    	private int id;
    	
    	ComparableClass(){}
    	
    public	ComparableClass(String name,int id){
    		this.name=name;
    		this.id=id;
    	}
    	public String getName() {
    		return name;
    	}
    	public int getId() {
    		return id;
    	}
    	public int compareTo(ComparableClass c) {
    		//return this.id-c.id; //compare by id;
    		if(this.id == c.id) {
    			//compare to string
    			return this.name.compareTo(c.name);
    		}else {
    			return this.id-c.id;
    		}
    	}
    	public String toString() {
    		return "details[id= " +id + " name "+name+"]";
    	}
    	
    }

