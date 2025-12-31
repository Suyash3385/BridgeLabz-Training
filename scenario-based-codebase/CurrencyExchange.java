import java.util.Scanner;
public class CurrencyExchange{
   public static void main(String[]args){
   char ch;
   Scanner sc=new Scanner(System.in);
   do{
    System.out.println("enter your inr amount");
	double amount=sc.nextInt();
	 System.out.println("enter target currency");
	  System.out.println("1. USD");
	   System.out.println("2.DIRHAM");
	    System.out.println("3. EUR");
		
		 System.out.println("enter your choice");
		 int choice=sc.nextInt();
		 
		 double exchangeAmount=0;
		 switch (choice){
		 
			case 1:
						exchangeAmount = amount*0.012;
						System.out.println("Amount in USD is : " + exchangeAmount);
						break;
						
				case 2:
						exchangeAmount = amount*0.044;
						System.out.println("Amount in DHR is : " + exchangeAmount);
						break;		
				case 3:
						exchangeAmount = amount*0.011;
						System.out.println("Amount in EUR is : " + exchangeAmount);
						break;
						
				default:
						System.out.println("Invalid options");
			}
			System.out.println("Do you want another conversion? (Y/N)");
             ch = sc.next().toUpperCase().charAt(0);
		}while(ch == 'Y');
	}
}
	
   
   