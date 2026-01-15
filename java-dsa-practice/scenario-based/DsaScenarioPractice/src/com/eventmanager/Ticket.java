package com.eventmanager;

public class Ticket {
	private String eventName;
	private double price;
	Ticket(String eventName,double price){
		this.eventName=eventName;
		this.price=price;
	}
	public String getName() {
		return eventName;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return eventName + " rs"+ price;
	}
}
