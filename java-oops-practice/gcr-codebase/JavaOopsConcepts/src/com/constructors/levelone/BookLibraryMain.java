package com.constructors.levelone;

public class BookLibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Ebook ebook = new Ebook(
                "978-0134685991",
                "Effective Java",
                "Joshua Bloch",
                5.2
        );

        ebook.displayEBookDetails();

       
        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());

	}

}
