//Write a program to check if the first is the smallest of the 3 numbers.

import java.util.Scanner;
public class Smallest{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   
   //Take all the three inputs
   int number1=sc.nextInt();
   int number2=sc.nextInt();
   int number3=sc.nextInt();
   
    //Compare if the first number is less than the second number and third number
	if(number1< number2 && number1<< number3){
	System.out.println("Is the" + number1+ " the smallest?" + "yes");
	}
	else{
	System.out.println("no");
	}

   
   }
}