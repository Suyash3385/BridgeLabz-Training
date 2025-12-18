//Write a program to check if the first, second, or third number is the largest of the three.
import  java.util.Scanner;
public class Largest{
   public static void main(String[]args){
   
    //Take inputs of three numbers
	Scanner sc=new Scanner(System.in);
	int number1=sc.nextInt();
	int number2=sc.nextInt();
	int number3=sc.nextInt();
	
	//check for the largest number
	
	if(number1> number2 && number1>number3){
	System.out.println("Is the first number the largest? yes");
	}
	else if(number2>number1 && number2>number3){
	System.out.println("Is the second number the largest? yes");
	}
	else{
	System.out.println("Is the third number the largest? yes");
	}



   }
}   