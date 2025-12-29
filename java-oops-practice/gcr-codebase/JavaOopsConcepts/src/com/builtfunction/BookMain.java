package com.builtfunction;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Book.setLibraryName("Egmore Library");
	       Book.displayLibraryName();
	       Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
	       book1.displayBookDetails();

	}

}
