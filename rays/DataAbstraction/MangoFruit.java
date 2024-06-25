package com.rays.DataAbstraction;

public class MangoFruit implements FruitsInterF{
    
	private int rs=40;
	
	
	public int getRs() {
		return rs;
	}

	public void setRs(int rs) {
		this.rs = rs;
	}
	
	public String fruitTaste() {
		
		return "Sweet";
	}

	public int price() {
	
		return rs;
	}

	
}

















