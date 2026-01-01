package com.inheritance.hybrid;

public class Person {
	 String name;
	    int id;

	    public Person(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public void displayInfo() {
	        System.out.println("ID   : " + id);
	        System.out.println("Name : " + name);
	    }
	

}
