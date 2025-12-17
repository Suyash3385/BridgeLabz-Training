import java.util.Scanner;
public class KilometersToMiles{
   public static void main(String[]args){
      //take the scanner and make it's object
      Scanner input=new Scanner(System.in);
	  double km =input.nextInt();
	  double mile=km/1.6;
      System.out.println("The total miles is "+mile+ " mile for the given" + km +" km");
	     }
	}	 
	  
	  