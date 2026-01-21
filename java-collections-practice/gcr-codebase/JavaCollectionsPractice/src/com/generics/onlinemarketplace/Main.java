package com.generics.onlinemarketplace;

public class Main {
	
	    public static void main(String[] args) {

	        Product<BookCategory> book= new Product<>("Java Book", 500, new BookCategory());
	        Product<ClothingCategory> shirt= new Product<>("hoodie", 1200, new ClothingCategory());

	        Product<GadgetCategory> phone= new Product<>("macbook", 20000, new GadgetCategory());

	        DiscountUtil.applyDiscount(book, 10);
	        DiscountUtil.applyDiscount(shirt, 20);
	        DiscountUtil.applyDiscount(phone, 5);

	        Catlog catalog=new Catlog();
	        catalog.addProduct(book);
	        catalog.addProduct(shirt);
	        catalog.addProduct(phone);

	        catalog.showCatalog();
	    }
	}


