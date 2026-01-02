package com.encapsulation;
	import java.util.*;

	public class LibraryApp {

	    public static void processLibraryItems(List<LibraryItem> items) {

	        for (LibraryItem item : items) {

	            item.getItemDetails();
	            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

	            if (item instanceof Reservable) {
	                Reservable r = (Reservable) item;
	                System.out.println("Available: " + r.checkAvailability());
	                r.reserveItem();
	         }

	           
	     }
	    }

	    public static void main(String[] args) {

	        List<LibraryItem> library=new ArrayList<>();

	        library.add(new Book(1,"Clean Code", "Robert C. Martin"));
	        library.add(new Magazine(2, "Java Monthly", "Oracle"));
	        library.add(new DVD(3, "Inception", "Christopher Nolan"));

	        processLibraryItems(library);
	  }
	}



