package com.rays.MethodOverriding;

public class CircleO extends ShapeO {

	double r;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r=r;
	}

	
	public double area() {
		return 3.14 * r * r;
	}

}
