package com.cinemahouse;

public class MovieShow {
private String name;
private int time;
MovieShow(String name,int time){
	this.name=name;
	this.time=time;
}
public String getName() {
	return name;
}
public int getTime() {
	return time;
}
public String toString() {
	return name+ time;
}
}
