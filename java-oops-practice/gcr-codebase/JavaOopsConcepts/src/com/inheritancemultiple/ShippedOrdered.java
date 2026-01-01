package com.inheritancemultiple;

public class ShippedOrdered extends Order {

	int trackingNumber;
	ShippedOrdered(int orderId,int orderDate, int trackingNumber){
		super(orderId,orderDate);
		this.trackingNumber=trackingNumber;
	}
	void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("trackingNumber "+trackingNumber);
	}
}
