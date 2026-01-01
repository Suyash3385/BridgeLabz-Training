package com.inheritance.singleInheritance;

public class Book {
	String title;
	int publicationYear;
	Book(String title,int publicationYear){
		this.title=title;
		this.publicationYear=publicationYear;
		
	}
	void displayInfo() {
		System.out.println("title " + title);
		System.out.println("publicationYear " + publicationYear);
		
	}
	

}
