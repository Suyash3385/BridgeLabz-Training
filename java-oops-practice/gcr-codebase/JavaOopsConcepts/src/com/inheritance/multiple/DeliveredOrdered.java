package com.inheritance.multiple;

public class DeliveredOrdered extends ShippedOrdered{
	int deliveryDate;
	DeliveredOrdered(int orderId,int orderDate,int trackingNumber,int deliveryDate){
		super(orderId, orderDate,trackingNumber);
		this.deliveryDate=deliveryDate;
		
	}
	void getOrderStatus() {
		System.out.println("deliveryDate "+ deliveryDate);
	}

}
