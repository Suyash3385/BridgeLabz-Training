package com.inheritance;

public class AnimalMain {
	public static void main(String[]args) {
	

        Animal a1 = new Dog("jack", 3);
        Animal a2 = new Cat("blacky", 2);
        Animal a3 = new Bird("chintu", 1);

        a1.makeSound(); 
        a2.makeSound(); 
        a3.makeSound(); 
	
	}
}
