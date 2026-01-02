package com.encapsulation;
	
	abstract class LibraryItem {

	    private int itemId;
	    private String title;
	    private String author;

	
	    private String borrowerName;

	    public LibraryItem(int itemId, String title, String author) {
	        this.itemId = itemId;
	        this.title = title;
	        this.author = author;
	    }

	    public int getItemId() {
	        return itemId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    protected String getBorrowerName() {
	        return borrowerName;
	    }

	    public void setBorrowerName(String borrowerName) {
	        this.borrowerName = borrowerName;
	    }

	
	    public void getItemDetails() {
	        System.out.println("ID: " + itemId);
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	    }

	
	    public abstract int getLoanDuration(); // in days
	}


