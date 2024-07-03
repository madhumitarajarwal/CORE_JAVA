package com.rays.MethodOverriding;

public class TestShapeO {
    public static void main(String[] args) {
    	 CircleO C=new CircleO();
    	 TriangleO t=new TriangleO();
    	 C.setR(4);
    	 t.setL(4);
    	 t.setB(3);
    	System.out.println( C.area());
    	System.out.println(t.area());
    	
    }
}
