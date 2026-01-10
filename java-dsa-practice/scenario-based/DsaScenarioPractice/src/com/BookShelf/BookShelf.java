package com.BookShelf;
import java.util.*;
public class BookShelf {

	    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
	    private HashSet<String> bookTracker = new HashSet<>();  
	    public void addBook(String genre, String title, String author) {
	        Book newBook=new Book(title, author, genre);
	        if (bookTracker.contains(newBook.getIdentifier())) {
	            System.out.println("Duplicate book: " + newBook);
	            return;
	        }
	        catalog.putIfAbsent(genre, new LinkedList<>());
	        catalog.get(genre).add(newBook);
	        bookTracker.add(newBook.getIdentifier());
	        System.out.println("Book added: " + newBook);
	    }
	    public void borrowBook(String genre, String title) {
	        if (!catalog.containsKey(genre)) {
	            System.out.println("Genre not found");
	            return;
	        }
	        LinkedList<Book>list=catalog.get(genre);
	        for (Book b:list) {
	            if (b.getTitle().equalsIgnoreCase(title)) {
	                list.remove(b);
	                System.out.println("Borrowed: " + b);
	                return;
	            }
	        }

	        System.out.println("Book not found ");
	    }
	    public void returnBook(String genre, String title, String author) {
	        addBook(genre, title, author);
	    }
	    public void showGenreBooks(String genre) {
	        if (!catalog.containsKey(genre)) {
	            System.out.println("No books found under genre: " + genre);
	            return;
	        }
	        System.out.println( genre);
	        for (Book b : catalog.get(genre)){
	            System.out.println( b);
	      }
	    }
	    public void showAllBooks(){
	        for (String genre:catalog.keySet()){
	            System.out.println(genre);
	            for (Book b:catalog.get(genre)){
	                System.out.println( b);
	   }
	  }
	 }
	}



