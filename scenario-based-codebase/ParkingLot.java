import java.util.Scanner;

public class ParkingLot{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int spots=10; 
   int occupied=0;
   boolean exit=false;
   
   while(!exit){
   System.out.println("choose");
   System.out.println("park");
   System.out.println("exit");
   System.out.println("show occupancy");
   
   int choose=sc.nextInt();
   
   switch(choose){
   case 1:
   if(occupied<spots){
   occupied++;
   System.out.println("car parked successfully");
   }
   else{
  System.out.println("car lot full");
   }
   break;
   case 2:
  
    if(occupied>0){
       occupied--;
        System.out.println("Car exited, Available spots " + (spots - occupied));
         }
		 else {
     System.out.println("Parking lot is empty");
        }
       break;
    case 3:
    System.out.println("Parking lot occupancy: " + occupied + spots);
      break;

    case 4:
       System.out.println("Exiting program");
        exit = true;
       break;

      default:
     System.out.println("Invalid choice");
            }
   if(occupied==spots){
   System.out.println("parking lot is full. no more cars allowed");
   exit=true;
   }
   }
   }
   }