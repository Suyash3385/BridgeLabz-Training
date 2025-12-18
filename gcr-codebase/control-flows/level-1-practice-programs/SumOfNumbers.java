//Write a program to find the sum of numbers until the user enters 0
import java.util.Scanner;
public class SumOfNumbers{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   
       double total = 0.0;                          
       double  number = sc.nextDouble();

        while (number != 0) {
            total = total + number;

            System.out.print("Enter a number: ");
            number = sc.nextDouble();
        }

        System.out.println("Total sum = " + total);
   }
}   