package Artify;

public abstract  class ArtWork implements IPurchasable{
String title;
String artist;
int price;
String licenseType;

ArtWork(String title , String artist, int price,String licenseType){
	this.title=title;
	this.artist=artist;
	this.price=price;
	this.licenseType=licenseType;
}
public void purchase(User u) {
	if(u.getBalance()>=price) {
		u.deductBalance(price);
	  } else {
          System.out.println(" Not enough balance " + title + "'");
      }
	}
}

