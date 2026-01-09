package Artify;

public class DigitalArt extends ArtWork {
DigitalArt(String title,String artist,int price,String licenseType){
	super(title,artist,price,licenseType);
}
public void license() {
	System.out.println(" digital license " +licenseType);
}
}
