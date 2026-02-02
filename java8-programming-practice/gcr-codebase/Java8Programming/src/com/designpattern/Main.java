package com.designpattern;

public class Main {
	

	    public static void main(String[] args) {
	        LibraryCatalog catalog=LibraryCatalog.getInstance();
	        Book book=new Book.BookBuilder("Data Structures by Cormen").addAuthor("Thomas H. Cormen").edition("3rd Edition").genre("Computer Science").publisher("MIT Press").build();

	        catalog.addBook(book);
	        User student=UserFactory.createUser("student");
	        student.getRole();
	        NotificationService notificationService=new NotificationService();

	        LibraryUser u1=new LibraryUser("Amit");
	        LibraryUser u2=new LibraryUser("Neha");

	        notificationService.subscribe(u1);
	        notificationService.subscribe(u2);

	        notificationService.notifyUsers("Book 'Data Structures by Cormen' is now available");
	    }
	}


