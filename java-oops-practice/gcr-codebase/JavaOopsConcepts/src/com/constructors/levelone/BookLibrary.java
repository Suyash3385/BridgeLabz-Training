package com.constructors.levelone;

public class BookLibrary {
	  public String ISBN;          
	    protected String title;      
	    private String author;       

	    // Constructor
	    BookLibrary(String ISBN, String title, String author) {
	        this.ISBN=ISBN;
	        this.title=title;
	        this.author=author;
	    }

	    // Setter for 
	    public void setAuthor(String author) {
	        this.author=author;
	    }

	    // Getter for 
	    public String getAuthor() {
	        return author;
	    }
	

}
