package com.constructors.levelone;

public class LibraryBook {
	String title;
	String author;
	double price;
	boolean availability;
	
	LibraryBook(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
		this.availability=true;
	}
    // Method to borrow a book
    void borrowBook(){
        if (availability){
        	availability=false;
            System.out.println("You have successfully borrowed: " + title);
        }
        else {
            System.out.println("the book is currently not available");
        }
    }
    void displayDetails(){
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : " + price);
        System.out.println("Available   : " + availability);
       
    }
}


