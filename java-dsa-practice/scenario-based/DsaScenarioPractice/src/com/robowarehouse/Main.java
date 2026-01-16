package com.robowarehouse;

public class Main {

	    public static void main(String[] args) {

	        RoboWarehouse robot=new RoboWarehouse();
	        robot.loadPackage(new PackageItem("Box-A", 12));
	        robot.loadPackage(new PackageItem("Box-B", 5));
	        robot.loadPackage(new PackageItem("Box-C", 20));
	        robot.loadPackage(new PackageItem("Box-D", 8));
	        robot.displayShelf();
	    }
	}



