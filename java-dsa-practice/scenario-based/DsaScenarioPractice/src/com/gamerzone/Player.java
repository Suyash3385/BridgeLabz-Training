package com.gamerzone;

public class Player {

	    private String playerName;
	    private int score;
	    public Player(String playerName, int score) {
	        this.playerName=playerName;
	        this.score=score;
	    }
	    public int getScore() {
	        return score;
	    }
	    public String getPlayerName() {
	        return playerName;
	    }
	    public String toString() {
	        return playerName +score;
	    }
	}



