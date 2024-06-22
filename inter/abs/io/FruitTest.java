package com.inter.abs.io;

public class FruitTest {
	public static void main(String[] args) {
	MangoFruit f = new MangoFruit();
    f.setRs(30);
    f.fruitTaste();
   // f.getRs();
    System.out.println("Mango taste is "+f.fruitTaste());
    System.out.println("Mango cost is "+f.price());
}
}