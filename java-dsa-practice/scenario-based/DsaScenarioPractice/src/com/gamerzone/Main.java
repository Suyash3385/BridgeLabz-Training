package com.gamerzone;

public class Main {
    public static void main(String[] args) {

        Player[] players = { new Player("ishan", 1500), new Player("riya", 2800), new Player("ananya", 1200), new Player("nova", 3100), new Player("wasim", 2000)};

        LeaderBoard leaderboard = new LeaderBoard();
        leaderboard.quickSort(players, 0, players.length-1);

        System.out.println("Leaderboard:");
        for (Player p:players) {
            System.out.println(p);
        }
    }
}



