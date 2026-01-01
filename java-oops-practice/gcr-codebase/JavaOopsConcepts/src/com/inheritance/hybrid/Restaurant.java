package com.inheritance.hybrid;

public class Restaurant {
	public static void main(String[] args) {

        Chef chef1 = new Chef("Suyash", 101, "Italian Cuisine");
        Waiter waiter1 = new Waiter("Amit", 102, 5);
        chef1.displayInfo();
        chef1.performDuties();
        System.out.println();

       
        waiter1.displayInfo();
        waiter1.performDuties();
    }
}


