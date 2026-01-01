package com.inheritance.Hierarchical;


	public class Student extends Person {
	    String grade;

	    public Student(String name, int age, String grade) {
	        super(name, age);
	        this.grade = grade;
	    }

	    public void displayRole() {
	        System.out.println("Role  : Student");
	        System.out.println("Grade : " + grade);
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        displayRole();
	    }
	}



