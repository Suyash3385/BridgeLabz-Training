//Write a Java program to count how many times a given substring occurs in a string.
import java.util.Scanner;
public class Substring{
   public static int countSubstring(String s,String sub){
   int count=0;
   for(int i=0;i<s.length();i++){
   if(s.substring(i,i+sub.length()).equals(sub)){
   count++;
   }
   }
   return count;
   }
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   String sub=sc.nextLine()l=;
   int result=countSubstring(s,sub);
   System.out.println("Substring occurs " + result + " times");
   }
   }