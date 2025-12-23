//Write a Java program to toggle the case of each character in a given string. Convert
//uppercase letters to lowercase and vice versa.
import java.util.Scanner;
public class Toggle{
  public static String checkToggle(String s){
  String result="";
    for(int i=0;i<s.length();i++){
	char ch=s.charAt(i);
	if(ch>='A' && ch<='Z'){
	 result+=(char) (ch+32);
	 }
	 else if(ch>='a' && ch<='z'){
	 result+=(char)(ch-32);
	 }
	 else{
	 result+=ch;
	 }
	 }
	 return result;
	 }
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   String toggle=checkToggle(s);
     System.out.println("Toggled String: " + toggle);
	 }
	 }