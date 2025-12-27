package com.constructors.levelone;

public class CarRentalMain {

    public static void main(String[] args){

        
        CarRental rental1=new CarRental("Suyash Sharma", "Honda City", 5);
        rental1.displayDetails();

        System.out.println();

       
        CarRental rental2=new CarRental();
        rental2.displayDetails();
    }


}
