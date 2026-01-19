package com.artexpo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Artist[] artist = {
		            new Artist("Aarav", 60),   
		            new Artist("Meera", 30),  
		            new Artist("Rohan", 90),   
		            new Artist("Ananya", 45)   
		        };

		        System.out.println("Before Sorting:");
		        display(artist);

		        insertionSort(artist);

		        System.out.println("\nAfter Sorting by Registration Time:");
		        display(artist);
		    }
		}