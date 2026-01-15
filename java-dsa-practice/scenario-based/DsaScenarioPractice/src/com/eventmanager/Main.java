package com.eventmanager;

public class Main {
	    public static void main(String[] args) {
	        Ticket[]tickets={
	            new Ticket("Music Fest", 2500),
	            new Ticket("Tech Expo", 1200),
	            new Ticket("Comedy Show", 1500),
	            new Ticket("sports event", 3500),
	            new Ticket("Workshop", 900)
	        };
	        EventManager manager =new EventManager();
	        System.out.println("Before Sorting:");
	        manager.printTickets(tickets);
	        manager.quickSort(tickets, 0, tickets.length - 1);
	        System.out.println("After Sorting by Price:");
	        manager.printTickets(tickets);
	 }
	}



