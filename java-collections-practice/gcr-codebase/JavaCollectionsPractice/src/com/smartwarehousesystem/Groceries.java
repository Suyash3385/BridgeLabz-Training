package com.smartwarehousesystem;

public class Groceries extends WarehouseItem {

    public Groceries(String name, double price) {
        super(name, price);
    }
    public void displayInfo() {
        System.out.println("grocery Item: " + name + "  Price: " + price);
    }

}
