//Write a program to check if two texts are anagrams and display the result
import java.util.Scanner;
public class Anagrams{
public static boolean checkAnagram(String s1,String s2){
  if(s1.length()!=s2.length()){
     return false;
}
int freq1[]=new int[256];
int freq2[]=new int [256];
	
	for(int i=0;i<text1.length();i++){
            char ch1=text1.charAt(i);
            char ch2=text2.charAt(i);
            freq1[ch1]++;
            freq2[ch2]++;
           }
		       for(int i=0;i<256;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
           }
        return true;
     }
  

   public static void main(String[]args){
   
           Scanner sc = new Scanner(System.in);
        String text1=sc.nextLine();
        String text2=sc.nextLine();

        boolean result=isAnagram(text1, text2);
        if(result){
            System.out.println("ANAGRAMS");
        } 
		else{
            System.out.println(" not anagrams");
        }
		}
	}
   