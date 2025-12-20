//An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
import java.util.Scanner;
   public class Athlete{
       public static int CalculateRounds( int side1,int side2,int side3){
	   
	           int perimeter = side1 + side2 + side3; 
        int totalDistance = 5000; 
		return totalDistance/perimeter;
		}
		
      public static void main(String[]args){
	  
	  Scanner sc=new Scanner(System.in);
	  int side1=sc.nextInt();
	  int side2=sc.nextInt();
	  int side3=sc.nextInt();
	  
	  int rounds=CalculateRounds( side1,side2,side3);
	  System.out.println("The number of rounds :" + rounds);
	  }
	 } 
	  
	  