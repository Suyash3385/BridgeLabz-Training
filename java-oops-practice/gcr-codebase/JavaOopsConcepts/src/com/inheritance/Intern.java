package com.inheritance;

public class Intern extends Employee{
	int duration;
	Intern(String name,int id,int salary, int duration){
		super(name,id,salary);
		this.duration=duration;
		
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("duration " + duration);
	}

}
