//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
import java.util.Scanner;
public class YoungAndTall{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int age1=sc.nextInt();
   int age2=sc.nextInt();
   int age3=sc.nextInt();
   
   double height1=sc.nextInt();
   double height2=sc.nextInt();
   double height3=sc.nextInt();
   
   //finding youngest friend
   if(age1<=age2 && age1<=age3){
   System.out.println("Amar is youngest");
   }
   else if(age2<=age1 && age2<=age3){
    System.out.println("Akbar is youngest");
   }
   else{
    System.out.println("Anthony is youngest");
	}
	
	//finding tallest friend
	if(height1>=height2 && height1>=height3){
	 System.out.println("Amar is tallest");
	 }
	 else if (height2>=height1 && height2>=height3){
	  System.out.println("Akbar is tallest");
	  }
	  else{
	   System.out.println("Anthony is tallest");
	   }
   }
}