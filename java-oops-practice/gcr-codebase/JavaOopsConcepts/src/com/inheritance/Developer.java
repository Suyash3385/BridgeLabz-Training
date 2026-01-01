package com.inheritance;

public class Developer extends Employee {
	String programmingLanguage;
	Developer (String name,int id,int salary,String programmingLanguage){
		super(name,id,salary);
		this.programmingLanguage=programmingLanguage;
	}
	   void displayDetails() {
	        super.displayDetails();  
	        System.out.println("Language : " + programmingLanguage);
	    }
}
