package com.constructors.levelone;

public class Student {
	public int rollNumber;
	protected String name;
	private double cgpa;
	
	//constructor
	Student(int rollNumber,String name,double cgpa){
		this.rollNumber=rollNumber;
		this.name=name;
		this.cgpa=cgpa;
	}
	
	//getter
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa=cgpa;
	}
	}


