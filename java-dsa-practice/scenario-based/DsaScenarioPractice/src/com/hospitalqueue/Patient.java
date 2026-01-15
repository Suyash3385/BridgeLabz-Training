package com.hospitalqueue;

public class Patient {
	private String name;
	private int critical;
	Patient(String name,int critical){
		this.name=name;
		this.critical=critical;
		
	}
	public String getName() {
		return name;
	}
	public int getCritical() {
		return critical;
	}
	
public String toString() {
	return name + " (Criticality: " + critical + ")";
}
}
