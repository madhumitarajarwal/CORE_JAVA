package com.rays.OOP.inheritance;

public class Circle extends Shape {

	public Circle(String color, int borderWidth, int radius) {
		super(color, borderWidth);
		this.radius = radius;

	}

	private int radius;

	public int getradius() {
		return radius;
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
