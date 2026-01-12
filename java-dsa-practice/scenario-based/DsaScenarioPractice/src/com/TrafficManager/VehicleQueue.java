package com.TrafficManager;

public class VehicleQueue {
	 private String[] arr;
	    private int front=-1,rear=-1, size;
	    public VehicleQueue(int size) {
	        this.size=size;
	        arr=new String[size];
	    }
	    public boolean isFull() {
	        return rear==size-1;
	    }
	    public boolean isEmpty() {
	        return front==-1;
	    }
	    public void enqueue(String number) {
	        if (isFull()) {
	            System.out.println("Queue Overflow Vehicle " + number );
	            return;
	        }
	        if (front==-1) front=0;
	        arr[++rear]=number;
	        System.out.println("Vehicle " + number + " added to waiting queue");
	    }
	    public String dequeue() {
	        if (isEmpty()){
	            System.out.println("Queue Underflow!");
	            return null;
	        }
	        String num=arr[front];
	        if(front==rear) front=rear=-1;
	        else front++;
	        return num;
	    }
	    public void printQueue() {
	        if (isEmpty()) {
	            System.out.println("empty");
	            return;
	        }
	        System.out.print("Waiting Queue ");
	        for(int i = front; i <= rear; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	}


	
	    


