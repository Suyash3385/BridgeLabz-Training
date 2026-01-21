package com.tailorshop;

public class Main {
	public static void main(String[]args) {
		Order orders[]= {new Order("jay",40),new Order("suyash",70),new Order("nova",21),new Order("kishan",8)};
		Order.insertionSort(orders);
		 for(Order o:orders) {
			   System.out.println(o.name + " - " + o.deadline);
	        }
		 }
	}


