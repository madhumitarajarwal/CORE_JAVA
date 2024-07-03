package com.rays.polymorphism;

public class AnimalTest {
	public static void main(String[] args) {
		
		//using dynamic method
//		Animal a= new Cat();
//		Animal a1=new Dog();
//		a.sound();
//		a1.sound();
		
		//array
   Animal[] a=new Animal[2];
    a[0] = new Dog();
    a[1]= new Cat();
    for(int i=0; i<a.length; i++) {
    	a[i].sound();
    }
	}

}
