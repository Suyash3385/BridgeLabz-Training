//Write a program to take 2 numbers and print their quotient and reminder
import java.util.Scanner;
public class QuotientRemainder{
  public static int[] findRemainderAndQuotient(int number, int divisor) {
  int quotient=number/divisor;
  int remainder=number%divisor;
  
  //create result array for storing quotient and remainder
  int result[]={quotient,remainder};
  return result;
  }
     
    public static void main(String[]args){
	
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int divisor=sc.nextInt();
	
	 int[] result = findRemainderAndQuotient(number, divisor);
     System.out.println("Quotient = " + result[0]);
      System.out.println("Remainder = " + result[1]);
	  }
	  
	}