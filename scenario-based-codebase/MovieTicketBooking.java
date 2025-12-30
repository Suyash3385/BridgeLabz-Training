import java.util.Scanner;
public class MovieTicketBooking{
   public static void main(String[]args){
	   
	   Scanner sc=new Scanner(System.in);
	   boolean movieBooking=true;
	   
	   while(movieBooking){
		   System.out.println("enter movie");
		   System.out.println("1. action");
		   System.out.println("2. drama");
		   System.out.println("3. comedy");
		   int choice =sc.nextInt();
		   String movieType="unknown";
		   switch(choice){
			   case 1:
			   movieType="action";
			   break;
			   
			   case 2:
			   movieType="drama";
			   break;
			   case 3:
			   movieType="comedy";
			   break;
			   
			   default:
			   System.out.println("invalid input");
			   
		   }
		      System.out.println("select seat type");
			     System.out.println("1. gold seat");
				    System.out.println("2. silver seat");
					int seatChoice=sc.nextInt();
					
					String seatType;
					int seatPrice;
					if(seatChoice==1){
						seatType="gold";
						seatPrice=1000;
					}
	   else if(seatChoice==2){
		   seatType="silver";
		   seatPrice=500;
	   }
	   else{
		   seatType="unknown";
		   seatPrice=0;
		    System.out.println("invalid seat choice");
	   }
	    System.out.println("Do you want snacks? (yes/no): ");
            String snackChoice=sc.next();

            boolean wantsSnacks=snackChoice.equalsIgnoreCase("yes");
            int snackPrice=wantsSnacks?50:0;
			
			int  totalPrice=seatPrice+snackPrice;
			   System.out.println("booking summary");
			      System.out.println("movieType" + movieType);
				     System.out.println("seatType" + seatType);
					    System.out.println("snackChoice" + snackChoice + "snackPrice" + snackPrice);
						   System.out.println("total bill" + totalPrice);
						   
					  System.out.println("Next customer?(yes/no):");
            String nextCustomer=sc.next();
            if (nextCustomer.equalsIgnoreCase("no")) {
                movieBooking = false;
                System.out.println("Thank you for using the Movie Ticket Booking App");
         }
        }

   }   
   }
			   
			   
		   
	   
	   
	   