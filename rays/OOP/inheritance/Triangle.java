package com.rays.OOP.inheritance;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle(int base, int height) {
		super("blue");
		this.base = base;
		this.height = height;
	}

	public int getBase() {  //implicit means automatic
		return base;
	}

	public int getHeight() {
		return height;
	}

	public double area() {
		return height * base / 2;
	}
}
