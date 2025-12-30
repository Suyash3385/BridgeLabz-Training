import java.util.Scanner;
public class TrainReservation{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int totalSeats=10;
 int choice;
  while(true){
  System.out.println("how many seats you have to book");
 if(totalSeats==0){
   System.out.println("no seats are left");
   break;
   }
     System.out.println("Available seats" + totalSeats);
	   System.out.println("1. menu");
	     System.out.println("2. exit");
		  System.out.println("enter your choice");
		 
		 
		 choice=sc.nextInt();
		 switch (choice){
			  case 1:
		   System.out.println("enter the number of seats");
		 int seat=sc.nextInt();
		
		 if(seat<=totalSeats && seat>0){
		 totalSeats=totalSeats-seat;
		  System.out.println("booking done");
		 }
		 else {
		   System.out.println("invalid number");
		   }
		   break;
		   case 2:
		     System.out.println("exiting the booking system");
			 return;
			 default:
			   System.out.println("invalid number");
			   }
			   }
			   }
			   }
		 