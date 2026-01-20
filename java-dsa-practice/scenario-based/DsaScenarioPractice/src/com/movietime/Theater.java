package com.movietime;

public class Theater {
	private Show[] shows;
    private int count;

    public Theater(int capacity) {
        shows=new Show[capacity];
        count=0;
    }
    public void addShow(Show newShow) {
        int i=count-1;

        while (i>=0 && shows[i].getShowTime()>newShow.getShowTime()) {
            shows[i + 1] = shows[i];
            i--;
        }
        shows[i+1]=newShow;
        count++;
    }

    public void displayShows() {
        for (int i=0; i<count;i++) {
            System.out.println(shows[i]);
        }
    }
}


