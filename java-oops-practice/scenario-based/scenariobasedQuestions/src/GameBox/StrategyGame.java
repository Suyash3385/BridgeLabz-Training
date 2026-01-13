package GameBox;

public class StrategyGame extends Game{
	StrategyGame(String title,int price,int rating){
		super(title,"strategy",price,rating);
	}
	public void playDemo() {
        System.out.println("Playing fast-paced demo of strategy game: " + title);
    }

}
