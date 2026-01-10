package com.BookShelf;

public class Main {
	 public static void main(String[] args) {
	        BookShelf shelf=new BookShelf();
	        shelf.addBook("Fiction", "The Alchemist", "Paulo Coelho");
	        shelf.addBook("Fiction", "Harry Potter", "J.K. Rowling");
	        shelf.addBook("Two-states", "romantic", "chetan bhagat");
	        shelf.addBook("Fantasy", "The Hobbit", "J.R.R. Tolkien");
	        shelf.addBook("Fiction", "The Alchemist", "Paulo Coelho");

	        shelf.borrowBook("Sci-Fi", "Dune");
	        shelf.returnBook("Sci-Fi", "Dune", "Frank Herbert");
	        shelf.showGenreBooks("Fiction");
	        shelf.showAllBooks();
}
}
