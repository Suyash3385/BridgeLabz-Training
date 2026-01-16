package com.cinemahouse;
public class Main {
    public static void main(String[] args) {

        MovieShow[] shows={
            new MovieShow("dhurandar", 1030),
            new MovieShow("border 2", 900),
            new MovieShow("batman", 1315),
            new MovieShow("stranger things", 1645)
        };
        CinemaHouse cinema=new CinemaHouse(shows);
        System.out.println("Before Sorting:");
        cinema.printShows();
        cinema.sortShowTimes();
        System.out.println("After Sorting :");
        cinema.printShows();
    }
}
