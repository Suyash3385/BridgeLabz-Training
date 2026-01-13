package GameBox;
import java.util.*;
public class User {
	
private String name;
private ArrayList<Game> ownedGames=new ArrayList<>();
User(String name){
	this.name=name;
}
public void buyGame(Game game) {
	if(game.price==0) {
		System.out.println("adding free games "+ game.title);
	}
	else {
		System.out.println("purchased games "+ game.title);
	}
	ownedGames.add(game);
}

public void showOwnedGames() {
    System.out.println(name + "'s Games:");
    for (Game g : ownedGames) {
        System.out.println( g.title + " (" + g.genre + ")");
    }
}
}
