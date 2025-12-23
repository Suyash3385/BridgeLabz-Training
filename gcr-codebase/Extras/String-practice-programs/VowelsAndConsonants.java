// Count Vowels and Consonants
//Write a Java program to count the number of vowels and consonants in a given string.
import java.util.Scanner;
public class VowelsAndConsonants{
   public static void main(String[]args){
   
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   int vowels=0,consonants=0;
   for(int i=0;i<s.length();i++){
   char ch=s.charAt(i);
   if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
   vowels++;
   }
   else{
   consonants++;
   }
   }
   System.out.println("count of vowels:" + vowels);
   System.out.println("count of consonants:" + consonants);
   }
}
   