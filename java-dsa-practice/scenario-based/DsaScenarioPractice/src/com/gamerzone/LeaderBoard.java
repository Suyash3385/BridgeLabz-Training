package com.gamerzone;

public class LeaderBoard {
    public void quickSort(Player[] players, int low, int high) {
	        if (low<high) {
	            int pivotIndex=partition(players, low, high);
	            quickSort(players, low, pivotIndex - 1);
	            quickSort(players, pivotIndex + 1, high);
	        }
	    }
	    private int partition(Player[] players, int low, int high) {
	        int pivot = players[high].getScore();
	        int i=low-1;

	        for (int j=low; j<high;j++) {
	            if (players[j].getScore()>pivot) {
	                i++;
	                swap(players, i, j);
	          }
	        }
	        swap(players, i+1, high);
	        return i + 1;
	    }
	    private void swap(Player[] players, int i, int j) {
	        Player temp = players[i];
	        players[i] = players[j];
	        players[j] = temp;
	    }
	}



