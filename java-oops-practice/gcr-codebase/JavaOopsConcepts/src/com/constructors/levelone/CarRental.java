package com.constructors.levelone;

public class CarRental {
	String customerName;
	String carModel;
	int rentalDays;
    double pricePerDay = 1500; 

    // Default Constructor
    CarRental(){
        customerName = "Unknown";
        carModel = "Not Selected";
        rentalDays = 0;
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
    }

    
    double calculateTotalCost() {
        return rentalDays*pricePerDay;
    }

  
    void displayDetails(){
        System.out.println("Customer Name : " +customerName);
        System.out.println("Car Model     : " +carModel);
        System.out.println("Rental Days   : " +rentalDays);
        System.out.println("Total Cost    : " +calculateTotalCost());
    }
	

} 
