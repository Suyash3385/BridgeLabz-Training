//Write a program to check if a number is divisible by 5

import java.util.Scanner;
public class Divisible{
   public static void main(String[]args){
    
	//Take the input number from the user
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	
	
	//check whether the number is divisible by 5
	if(number%5==0){
	System.out.println(number + "is divisible by 5");
	}
	else {
	System.out.println(number + " is not divisible by 5");
	}
	
	}
}	
	