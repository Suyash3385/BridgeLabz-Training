//Write a Java program to remove all duplicate characters from a given string and return
//the modified string.
import java.util.Scanner;
public class Duplicate{
  public static String removeDuplicate(String s){
  String res="";
  for(int i=0;i<s.length();i++){
	  char ch=s.charAt(i);
  if(res.indexOf(ch)==-1){
  res+=s.charAt(i);
  }
  }
  return res; 
  }
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   String res=removeDuplicate(s);
   System.out.println(res);
   }
   }