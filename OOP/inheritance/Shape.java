package com.OOP.inheritance;

public class Shape {
	
	private String color = null;
	private int borderWidth;
	
	public Shape(String color) {
		this.color = color;
	}

	public Shape(String color, int borderWidth) {
		this.color = color;
		this.borderWidth = borderWidth;
	}

	public String getcolor() {
		return color;
	}

	public int getborderWidth() {
		return borderWidth;
	}
}
