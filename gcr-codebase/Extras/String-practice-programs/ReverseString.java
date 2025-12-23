//Write a Java program to reverse a given string without using any built-in reverse

import java.util.Scanner;
public class ReverseString{
   public static String makeReverse(String s){
   String rev="";
        int len=s.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
		return rev;
		}
public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
     String result=makeReverse(s);
	 System.out.println(result);
	
      
		}
		}
		