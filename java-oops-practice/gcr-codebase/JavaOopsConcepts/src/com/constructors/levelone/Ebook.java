package com.constructors.levelone;

public class Ebook extends BookLibrary{
	
	
	

	    double fileSize;

	    Ebook(String ISBN, String title, String author, double fileSize) {
	        super(ISBN, title, author);
	        this.fileSize=fileSize;
	    }

	    
	    void displayEBookDetails() {
	        System.out.println("ISBN: " + ISBN);           
	        System.out.println("Title: " + title);         
	        System.out.println("Author: " + getAuthor());  
	        System.out.println("File Size: " + fileSize + " MB");
	    }
	}


