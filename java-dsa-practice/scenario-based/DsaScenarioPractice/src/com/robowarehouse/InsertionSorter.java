package com.robowarehouse;

public class InsertionSorter {
	    public void sort(PackageItem[] shelf, int itemCount) {
	        for (int i = 1; i < itemCount; i++) {
	            PackageItem key = shelf[i];
	            int j = i-1;
	            while (j >= 0 && shelf[j].getWeight()>key.getWeight()) {
	                shelf[j+1] = shelf[j];
	                j--;
	            }
	            shelf[j+1]=key;
	        }
	    }
	}



