package com.robowarehouse;

public class PackageItem {
	  private String id;
	    private int weight;

	    public PackageItem(String id, int weight) {
	        this.id=id;
	        this.weight=weight;
	    }

	    public int getWeight() {
	        return weight;
	    }

	    public String getId() {
	        return id;
	    }
}
