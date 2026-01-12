package com.TrafficManager;

public class Main {
	 public static void main(String[] args) {

	        CircularLinkedList roundabout = new CircularLinkedList();
	        VehicleQueue queue = new VehicleQueue(5);

	        // Add waiting cars to queue
	        queue.enqueue("KA01");
	        queue.enqueue("DL05");
	        queue.enqueue("MH12");

	        queue.printQueue();

	        // Enter cars from queue into roundabout
	        roundabout.addVehicle(queue.dequeue());
	        roundabout.addVehicle(queue.dequeue());

	        roundabout.printRoundabout();
	        queue.printQueue();

	        // Add car directly to roundabout
	        roundabout.addVehicle("GJ09");
	        roundabout.printRoundabout();

	        // Remove a vehicle
	        System.out.println("Removing DL05...");
	        roundabout.removeVehicle("DL05");

	        roundabout.printRoundabout();

	        queue.enqueue("UP14");
	        queue.enqueue("TN10");
	        queue.enqueue("RJ22");
	        queue.enqueue("PB07");
	 }

}
