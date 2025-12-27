package com.constructors.levelone;

class book {

    // Attributes
    String title;
    String author;
    double price;


     book() {
        title="Unknown";
        author="Unknown";
        price=0.0;
    }

    // Parameterized Constructor
    book(String title, String author, double price) {
        this.title=title;
        this.author=author;
        this.price=price;
        }

    // Method to display book details
    void display(){
        System.out.println("Title  : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price  : "+price);
        }
    public static void main(String[] args){

       
        book b1 = new book();
        b1.display();
        book b2 = new book("Java Programming", "James Gosling", 499.50);
        b2.display();
    }
}

