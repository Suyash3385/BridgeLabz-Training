//Write a program to find the sum of n natural numbers using loop
import java.util.Scanner;
public class NaturaLNumber{
   public static int SumNaturalNumber(int number){
   int sum=0;
   for(int i=0;i<number;i++){
   sum+=i;
   }
   return sum;
  }
   public static void main (String[]args){
   
   Scanner sc=new Scanner(System.in);
   int number=sc.nextInt();
   int result=SumNaturalNumber(number);
   System.out.println("sum :" + result);
   
   }
  } 
   