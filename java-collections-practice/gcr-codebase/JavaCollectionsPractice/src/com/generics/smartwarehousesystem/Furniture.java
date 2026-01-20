package com.generics.smartwarehousesystem;


public class Furniture extends WarehouseItem {

    public Furniture(String name, double price) {
        super(name, price);
    }
    public void displayInfo() {
        System.out.println("Furniture: " + name + "  Price: " + price);
    }
}
