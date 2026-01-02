package com.encapsulation;
import java.util.*;
public class Ecommerce {
	
	    public static void calculateFinalPrice(List<Product> products) {

	        for (Product p : products) {
	            double price = p.getPrice();
	            double discount = p.calculateDiscount();
	            double tax = 0;

	            if (p instanceof Taxable) {
	                tax = ((Taxable) p).calculateTax();
	                System.out.println(((Taxable) p).getTaxDetails());
	            }

	            double finalPrice = price + tax - discount;

	            System.out.println("Product: " + p.getName());
	            System.out.println("Final Price: " + finalPrice);
	        
	        }
	    }

	    public static void main(String[] args) {

	        List<Product> productList = new ArrayList<>();

	        productList.add(new Electronics(101, "Laptop", 60000));
	        productList.add(new Clothing(102, "Jacket", 3000));
	        productList.add(new Groceries(103, "Rice Bag", 1200));

	        calculateFinalPrice(productList);
	    }
	}



