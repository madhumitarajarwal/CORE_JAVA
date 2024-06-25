package com.rays.OOP.inheritance;

public class RectangleShap extends Shape {

	RectangleShap(String color, int borderWidth, int length, int width) {
		super(color, borderWidth);
		this.length = length;
		this.width = width;
	}

	private int length = 0;
	private int width = 0;

	public int getlength() {
		return length;
	}

	public int getwidth() {
		return width;
	}

	public int area() {
		return length * width;
	}
}
