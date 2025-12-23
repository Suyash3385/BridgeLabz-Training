//Write a program to find the first non-repeating character in a string and show the result
import java.util.Scanner;
public class NonRepeating{
 public static char checkNonRepeating(String txt){
 int freq[]=new int[256];
 
 //count frequency
 for(int i=0;i<txt.length();i++){
 char ch=txt.charAt(i);
 freq[ch]++;
 } 
 //check for non repeating 
 for(int i=0;i<txt.length();i++){
 char ch=txt.charAt(i);
 if(freq[ch]==1){
 return ch;
 }
 }
 return '\0';  
 }
  public static void main(String[]args){
   
   Scanner sc=new Scanner(System.in);
   String txt=sc.nextInt();
   char result=checkNonRepeating(txt);
   
   if(result!='\0'){
   System.out.println("repeating char found:" + result);
   }
   else{
   System.out.println(" no repeating char found");
   }
  }
}  