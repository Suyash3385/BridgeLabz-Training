package com.BookShelf;
import java.util.*;
public class Book {
private String title;
private String author;
private String genre;
Book(String title,String author,String genre){
	this.title=title;
	this.author=author;
	this.genre=genre;
	
}
public String getTitle() {
	return title;
}
public String getAuthor() {
	return author;
	
}
public String getGenre() {
	return genre;
	
}

public String toString() {
    return title + " by " + author;
}
public String getIdentifier() {
    return title.toLowerCase() + "-" + author.toLowerCase();
}
}
