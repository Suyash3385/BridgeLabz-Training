public class VolumeOfEarth{
   public static void main(String[]args){
	//volume of earth in kilometers and miles
	
	
    double radius=6378; 
    double volumeOfEarth=(4.0/3.0) *3.14* radius*radius*radius;
    double voulmeInMiles=volumeOfEarth*0.239913;
	
	
    System.out.println("The volume of earth in cubic kilometers is "+volumeOfEarth+ "and cubic miles is " + voulmeInMiles);
   }
}