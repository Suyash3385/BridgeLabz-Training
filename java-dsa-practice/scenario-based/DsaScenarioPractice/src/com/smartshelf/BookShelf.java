package com.smartshelf;
public class BookShelf {
    public void insertBook(Book[] books,int n,Book newBook) {
        books[n]=newBook;  
        int i=n;
        while (i>0 && books[i-1].getTitle().compareToIgnoreCase(books[i].getTitle())>0) {
          
            Book temp=books[i];
            books[i]=books[i - 1];
            books[i-1]=temp;
            i--;
     }
    }
    public void printShelf(Book[] books, int count) {
        for (int i=0; i<count; i++) {
            System.out.println(books[i]);
        }
    }
}
