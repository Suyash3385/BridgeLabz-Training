package com.collections.queueinterface;

public class CircularBuffer {
	    private int[] buffer;
	    private int size;
	    private int front;
	    private int rear;
	    private int count;

	    CircularBuffer(int size) {
	        this.size=size;
	        buffer=new int[size];
	        front=0;
	        rear=0;
	        count=0;
	    }
	    public void insert(int value) {
	        if (count==size) {
	            front=(front+1)%size;
	        } 
	        else {
	            count++;
	        }
	        buffer[rear]=value;
	        rear=(rear+1)%size;
	    }
	    public void display() {
	        if (count==0) {
	            System.out.println(" empty");
	            return;
	        }
	        for (int i=0;i<count;i++) {
	            System.out.print(buffer[(front+i)%size]);
	            if(i<count-1)
	                System.out.print(", ");
	    }
	    }
	}

	
