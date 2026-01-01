package com.inheritance;

public class Cat extends Animal {
	Cat(String name,int age){
		super(name,age);
	}
	void makeSound() {
		System.out.println("cat meows");
		
	}

}
