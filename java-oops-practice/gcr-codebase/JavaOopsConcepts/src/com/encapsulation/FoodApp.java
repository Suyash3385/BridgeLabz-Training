package com.encapsulation;

import java.util.*;
public class FoodApp {
	

	    public static void processOrder(List<FoodItem> orderItems) {

	        for (FoodItem item : orderItems) {

	            item.getItemDetails();
	            double total = item.calculateTotalPrice();
	            double discount = 0;

	            if (item instanceof Discountable) {
	                Discountable d = (Discountable) item;
	                discount = d.applyDiscount();
	                System.out.println(d.getDiscountDetails());
	            }

	            double finalAmount = total - discount;
	            System.out.println("Final Amount: " + finalAmount);
	        
	      }
	    }

	    public static void main(String[] args) {

	        List<FoodItem> order = new ArrayList<>();

	        order.add(new VegItem("alfredo pasta", 310, 2));
	        order.add(new NonVegItem("Chicken shawarma", 240, 1));

	        processOrder(order);
	    }
	}



