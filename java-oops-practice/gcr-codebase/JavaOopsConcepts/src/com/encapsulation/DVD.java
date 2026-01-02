package com.encapsulation;

	class DVD extends LibraryItem implements Reservable {

	    private boolean available = true;

	    public DVD(int id, String title, String author) {
	        super(id, title, author);
	    }

	
	    public int getLoanDuration() {
	        return 3; 
	    }

	 
	    public void reserveItem() {
	        if (available) {
	            available = false;
	            System.out.println("DVD reserved successfully");
	        } else {
	            System.out.println("DVD already reserved");
	        }
	    }


	    public boolean checkAvailability() {
	        return available;
	    }
	}



