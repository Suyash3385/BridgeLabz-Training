package com.movietime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Theater theater=new Theater(10);

	        theater.addShow(new Show("dhurandhar", 600)); 
	        theater.addShow(new Show("stranger things", 720)); 
	        theater.addShow(new Show("border2", 840)); 
	        theater.addShow(new Show("Batman", 780)); 

	        System.out.println("Sorted Show Timings:");
	        theater.displayShows();
	}

}
