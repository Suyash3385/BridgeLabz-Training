//Rewrite program 14 using for loop
import java.util.Scanner;
public class FindFactorial{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int number=sc.nextInt();
   int fact=1;
if(number<=0){
   System.out.println("enter natural number");
   }
   else{
   for(int i=number;i>0;i--){
   fact*=i;
   }
     System.out.println(fact);
	 }
   }	
 }
