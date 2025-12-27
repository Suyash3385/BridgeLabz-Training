package com.constructors.levelone;

public class LibraryBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

		        LibraryBook b1=new LibraryBook("Java Programming", "James Gosling", 499.99);

		        b1.displayDetails();
		        b1.borrowBook();  
		        b1.borrowBook();   
		        b1.displayDetails();
		   

	}

}
