package GameBox;

public class ArcadeGame extends Game {
	ArcadeGame(String title,int price,int rating){
		super(title,"arcade",price,rating);
	}
	 
	    @Override
	    public void playDemo() {
	        System.out.println("Playing fast-paced demo of Arcade game: " + title);
	    }

}
