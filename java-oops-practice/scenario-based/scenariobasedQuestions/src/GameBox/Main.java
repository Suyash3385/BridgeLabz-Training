package GameBox;

public class Main {
	public static void main(String[]args) {
	User u=new User("suyash");
	Game g1=new ArcadeGame("basketball",299,4);
	Game g2=new StrategyGame("chess",150,3);
    System.out.println("Applying festival discount 20%");
    g2.applyDiscount(20);  
    g1.download();
    g1.playDemo();

    g2.download();
    g2.playDemo();
    System.out.println();
    u.buyGame(g1);
    u.buyGame(g2);
    System.out.println();
    u.showOwnedGames();

}
}