package com.robowarehouse;

	class RoboWarehouse {

	    private PackageItem[] shelf=new PackageItem[20]; 
	    private int count=0;  
	    private InsertionSorter sorter=new InsertionSorter();
	    public void loadPackage(PackageItem item) {
	        shelf[count]=item;
	        count++;
	        sorter.sort(shelf, count); 
	    }
	    public void displayShelf() {
	        System.out.println("Shelf (Sorted by Weight):");
	        for (int i=0;i<count; i++) {
	            System.out.println(shelf[i].getId() + shelf[i].getWeight() + "kg");
	        }
	    }
	}


