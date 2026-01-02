package com.encapsulation;
	
	class NonVegItem extends FoodItem implements Discountable {

	    private static final double NON_VEG_CHARGE=50;

	    public NonVegItem(String name, double price, int qty) {
	        super(name, price, qty);
	    }

	    public double calculateTotalPrice() {
	        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
	    }

	    
	    public double applyDiscount() {
	        return calculateTotalPrice()*0.05; 
	    }

	   
	    public String getDiscountDetails() {
	        return "5% discount on Non-Veg Items";
	    }
	}



