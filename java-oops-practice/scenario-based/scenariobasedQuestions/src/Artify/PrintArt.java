package Artify;

public class PrintArt extends ArtWork {
	PrintArt(String title,String artist,int price,String licenseType){
		super(title,artist,price,licenseType);
	}
	public void license() {
		System.out.println("temporary license "+ licenseType);
	}

}
