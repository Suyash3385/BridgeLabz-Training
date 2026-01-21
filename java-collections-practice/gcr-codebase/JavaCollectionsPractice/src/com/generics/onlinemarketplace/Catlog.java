package com.generics.onlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Catlog {
	    private List<Product<?>> products=new ArrayList<>();
	    public void addProduct(Product<?> product) {
	        products.add(product);
	    }
	    public void showCatalog(){
	        for (Product<?>p:products) {
	            System.out.println( p.getName()+p.getPrice()+p.getCategory().getCategoryName());
	        }
	    }
	}


