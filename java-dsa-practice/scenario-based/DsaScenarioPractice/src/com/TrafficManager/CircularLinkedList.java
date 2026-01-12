package com.TrafficManager;

public class CircularLinkedList {
	  private Vehicle head=null;
	    public void addVehicle(String number) {
	        Vehicle newNode=new Vehicle(number);

	        if (head==null) {
	            head=newNode;
	            newNode.next=head; 
	            return;
	        }
	        Vehicle temp=head;
	        while (temp.next!=head) {
	            temp=temp.next;
	        }
	        temp.next=newNode;
	        newNode.next=head;
	    }
	    public boolean removeVehicle(String number) {
	        if (head==null) return false;
	        Vehicle curr=head;
	        Vehicle prev=null;

	        do {
	            if (curr.number.equals(number)) {
	                if (prev==null) {
	                    Vehicle last=head;
	                    while (last.next!=head) last=last.next;
	                    head=head.next;
	                    last.next=head;
	                } 
	                else {
	                    prev.next=curr.next;
	                }
	                return true;
	            }
	            prev=curr;
	            curr=curr.next;
	        } while(curr!=head);
	        return false;
	    }
	    public void printRoundabout() {
	        if (head==null) {
	            System.out.println("Roundabout is EMPTY.");
	            return;
	        }
	        Vehicle temp=head;
	        System.out.print("Roundabout  ");
	        do {
	            System.out.print(temp.number );
	            temp=temp.next;
	        } while(temp!=head);
	        System.out.println("back to start");
	    }
	    public boolean isEmpty() {
	        return head==null;
	    }
	}



