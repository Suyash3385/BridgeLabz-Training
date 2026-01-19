package com.smartwarehousesystem;

public class Main {
	public static void main(String[] args) {

        Storage<Electronics>electronicsStorage=new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 65000));
        electronicsStorage.addItem(new Electronics("Mobile", 35000));

        Storage<Groceries> groceryStorage=new Storage<>();
        groceryStorage.addItem(new Groceries("Rice", 1200));
        groceryStorage.addItem(new Groceries("Oil", 900));

        Storage<Furniture>furnitureStorage=new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 2500));

        System.out.println("Electronics Items:");
        WarehouseUtil.displayAllItems(electronicsStorage.getItems());

        System.out.println(" Grocery Items:");
        WarehouseUtil.displayAllItems(groceryStorage.getItems());

        System.out.println(" Furniture Items:");
        WarehouseUtil.displayAllItems(furnitureStorage.getItems());
    }
}


