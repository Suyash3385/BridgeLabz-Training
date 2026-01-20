package com.movietime;

public class Show {
	
	   private String movieName;
	    private int showTime;

	    public Show(String movieName, int showTime) {
	        this.movieName=movieName;
	        this.showTime=showTime;
	    }
	    public int getShowTime(){
	        return showTime;
	    }
	    public String getMovieName() {
	        return movieName;
	    }
	    public String toString() {
	        return movieName +  showTime;
	    }
}
