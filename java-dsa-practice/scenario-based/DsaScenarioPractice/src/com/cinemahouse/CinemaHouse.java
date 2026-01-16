package com.cinemahouse;

public class CinemaHouse {

	    private MovieShow[] shows;
	    public CinemaHouse(MovieShow[] shows) {
	        this.shows=shows;
	    }
	    public void sortShowTimes() {
	        Cinema sorter=new Cinema ();
	        sorter.sort(shows);
	    }
	    public void printShows() {
	        for (MovieShow show :shows) {
	            System.out.println(show.getName() + show.getTime());
	        }
	    }
	}



