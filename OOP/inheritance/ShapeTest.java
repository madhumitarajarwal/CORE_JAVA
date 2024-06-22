package com.OOP.inheritance;

public class ShapeTest {
  public static void main(String[] args) {
	  Circle c=new Circle("red",5,4);
	  System.out.println("****this is circle class*****");
	  System.out.println("color"+c.getcolor());
	  System.out.println("border"+c.getborderWidth());
	  System.out.println("radius"+c.getradius());
	  System.out.println("area"+c.area());
	  
	  
	  RectangleShap R= new RectangleShap("blue",4,5,7);
	  System.out.println("****this is rectangle class*****");
	  System.out.println("color "+R.getcolor());
	  System.out.println("border "+R.getborderWidth());
	  System.out.println("area "+R.area());
	  
	  Triangle t=new Triangle(4,4);
	  System.out.println("*****this is triangle class*****");
	  System.out.println("color"+t.getcolor());
	  System.out.println("base "+t.getHeight());
	  System.out.println("height "+ t.getBase());
	  System.out.println("area "+t.area());
	  
  }
}
