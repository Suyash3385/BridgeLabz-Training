import java.util.Scanner;
public class Palindrome{
public static boolean checkPalindrome(String s){
 int i=0,j=s.length()-1;
 while(i<j){
 if(s.charAt(i)!=s.charAt(j)){
 return false;

 }
 i++;
 j--;
 }
 return true;
 }
 
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  boolean result=checkPalindrome(s);
if (result){
        System.out.println(s + " is a palindrome");
        }
		else {
            System.out.println(s + " is not a palindrome");
        }

  }
  } 