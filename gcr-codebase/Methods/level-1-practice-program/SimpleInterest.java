//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
import java.util.Scanner;
public class SimpleInterest{
	//create method for calculating simple interest
     public static int Calculate(int principal,int rate,int time){
	 int SimpleInterest = principal * rate * time / 100;
	 return SimpleInterest;
	 }

   public static void main (String[]args){
    
   //Take user input for principal, rate, time
    Scanner sc=new Scanner(System.in);
     int principal=sc.nextInt();
     int rate=sc.nextInt();
     int time=sc.nextInt();
     	  int result=Calculate(principal,rate,time);
		System.out.println(result);
		}
		}