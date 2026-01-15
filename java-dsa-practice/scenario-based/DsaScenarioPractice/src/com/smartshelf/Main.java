package com.smartshelf;

public class Main {
	public static void main(String[] args) {
		       Book[] shelf=new Book[10]; 
		        BookShelf bs=new BookShelf();
		        int count=0;
		        Book b1=new Book("Algorithms", "Cormen");
		        bs.insertBook(shelf, count++, b1);
		        Book b2=new Book("Data Structures", "Mark Allen");
		        bs.insertBook(shelf, count++, b2);

		        Book b3=new Book("Artificial Intelligence", "Peter Norvig");
		        bs.insertBook(shelf, count++, b3);

		        Book b4=new Book("Computer Networks", "Tanenbaum");
		      bs.insertBook(shelf, count++, b4);
		        System.out.println("Books in alphabetical order:");
		      bs.printShelf(shelf, count);
		    }
		}
