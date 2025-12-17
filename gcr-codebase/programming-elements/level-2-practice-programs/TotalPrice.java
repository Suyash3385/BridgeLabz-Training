import java.util.Scanner;
public class TotalPrice{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   
   //input unit price and quantity
   double unitPrice=sc.nextDouble();
   double quantity=sc.nextDouble();
   double totalPrice=unitPrice*quantity;
   
   
           System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity +
                           " and unit price is INR " + unitPrice);
			}
}