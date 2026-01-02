package com.encapsulation;


	
	class Book extends LibraryItem implements Reservable {

	    private boolean available = true;

	    public Book(int id, String title, String author) {
	        super(id, title, author);
	    }

	    @Override
	    public int getLoanDuration() {
	        return 14; 
	    }

	    @Override
	    public void reserveItem() {
	        if (available) {
	            available = false;
	            System.out.println("Book reserved successfully");
	        } else {
	            System.out.println("Book already reserved");
	        }
	    }

	    @Override
	    public boolean checkAvailability() {
	        return available;
	    }
	}



