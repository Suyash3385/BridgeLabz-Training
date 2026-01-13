package GameBox;

public abstract class Game implements IDownloadable{
	String title;
	String genre;
	int price;
	int rating;
	Game(String title,String genre,int price,int rating){
		this.title=title;
		this.genre=genre;
		this.price=price;
		this.rating=rating;
	}
	public void applyDiscount(int percent) {
		price-=price*(percent/100);
	}
	  public void download(){
	        System.out.println("Downloading: "+title);
}
}
