
import java.util.Scanner;

public class UserFeeDiscount
{  
    public static void main(String[] args)
    {
        //take the scanner and the input
        
        
        Scanner input = new Scanner(System.in); //Scanner object
        
        double fee = input.nextDouble();              
        double discountPercent = input.nextDouble(); /
        
        double discount = fee * discountPercent / 100; //calculating discount
        double finalFee = fee - discount;               //calculating final fee
        
        System.out.println("The discount amount is INR " + discount +
                          " and final discounted fee is INR " + finalFee);   
     }
}
