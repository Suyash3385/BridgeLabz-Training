package com.smartwarehousesystem;

public class Electronics extends WarehouseItem {
	

    public Electronics(String name, double price) {
        super(name, price);
    }
    public void displayInfo() {
        System.out.println("Electronics: " + name + "  Price: " + price);
    }
}
