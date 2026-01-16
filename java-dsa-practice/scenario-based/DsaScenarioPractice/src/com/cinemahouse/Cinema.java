package com.cinemahouse;


public class Cinema {
	public void sort(MovieShow[] shows) {
		 int n=shows.length;
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<n-i-1;j++) {
				 if(shows[j].getTime()>shows[j+1].getTime()) {
					 MovieShow  temp=shows[j];
					 shows[j]=shows[j+1];
					 shows[j+1]=temp;
					 
				 }
			 }
		 }
	}
}
