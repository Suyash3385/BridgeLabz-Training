//Problem:
Write a Java program to find the most frequent character in a string.
import java.util.Scanner;
 public class FrequentChar{
   public static char freqChar(String s){
   int freq[]=new int[256];
   for(int i=0;i<s.length();i++){
   freq[s.charAt(i)]++;
   }
   char result=s.charAt(0);
   int max=freq[result];
       for(int i =1; i<s.length(); i++) {
            if (freq[s.charAt(i)] > max){
                max =freq[s.charAt(i)];
                result = s.charAt(i);
        }
     }
        return result;
    }
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   String s= sc.nextLine();
   
        char ch = mostFrequentCharacter(s);
        System.out.println("Most frequent character: " + ch
		}
		}