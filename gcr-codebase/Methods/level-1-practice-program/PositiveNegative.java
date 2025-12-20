//Write a program to check whether a number is positive, negative, or zero
import java.util.Scanner;
public class PositiveNegative{
  public static int check(int number){
   if(number==0){
   return 0;
   }
   else if (number<0){
   return -1;
   }
   else{
   return 1;
   }
  }
    public static void main(String[]args){
	
	Scanner sc=new Scanner(System.in);
	
	 int number=sc.nextInt();
	 int checkNumber=check(number);
	 System.out.println(checkNumber);
	 }
	} 
	 