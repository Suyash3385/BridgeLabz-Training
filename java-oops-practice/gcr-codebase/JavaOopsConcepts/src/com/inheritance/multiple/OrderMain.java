package com.inheritance.multiple;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Order o1=new Order(1,16);
  ShippedOrdered s1=new ShippedOrdered(1,17,7910);
  DeliveredOrdered d1=new  DeliveredOrdered(1,17,7910,20);
  
  o1.getOrderStatus();
  s1.getOrderStatus();
  d1.getOrderStatus();
	}

}
