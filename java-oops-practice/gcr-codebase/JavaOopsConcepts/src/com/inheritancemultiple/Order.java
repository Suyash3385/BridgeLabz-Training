package com.inheritancemultiple;

public class Order {
 int orderId;
 int orderDate;
 Order(int orderId,int orderDate){
	 this.orderId=orderId;
	 this.orderDate=orderDate;
	 
 }
 void getOrderStatus() {
	 System.out.println("orderId "+ orderId);
	 System.out.println("orderDate "+ orderDate);
 }
 
}
