package com.inheritance;

public class Employee {
	String name;
	int id;
	int salary;
	Employee(String name,int id,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void displayDetails() {
	System.out.println("Name " + name);
	System.out.println("id " + id);
	System.out.println("salary " + salary);
	

	}

}
