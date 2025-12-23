//Write a Java program to check if a given string is a palindrome
import java.util.Scanner;
 public class Palindrome{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   int i=0,j=s.length()-1;
   boolean isPal=true;
   while(i<j){
   if(s.charAt(i)!=s.charAt(j)){
   isPal=false;
   break;
   }
   i++;
   j--;
   }
         if(isPal){
            System.out.println(s+" is a palindrome");
        }
        else {
            System.out.println(s+ " not a palindrome");
        }
    }
}