package com.collections.queueinterface;
	import java.util.PriorityQueue;
	import java.util.Scanner;

	class Patient implements Comparable<Patient>{
	    String name;
	    int serious;
	    Patient(String name, int serious) {
	        this.name=name;
	        this.serious=serious;
	    }
	    public int compareTo(Patient p) {
	        return p.serious-this.serious;
	 }
	}
	public class HospitalTriage {
	    public static void main(String[] args) {

	        Scanner sc=new Scanner(System.in);
	        PriorityQueue<Patient>pq=new PriorityQueue<>();
	        System.out.print("Enter number of patients: ");
	        int n=sc.nextInt();
	        for (int i=0;i<n;i++) {
	            System.out.print("Enter patient name: ");
	            String name=sc.next();
	            System.out.print("Enter severity: ");
	            int serious=sc.nextInt();
	            pq.add(new Patient(name, serious));
	        }
	        while (!pq.isEmpty()) {
	            Patient p=pq.remove();
	            System.out.println(p.name + " (Severity " + p.serious + ")");
	        }
	    }
	}


