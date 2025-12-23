//Write a Java program that takes a sentence as input and returns the longest word in the

import java.util.Scanner;
public class LongestWord { 
    public static String findLongestWord(String s) {
        String[] words=s.split(" ");
        String longestWord= "";
        for(int i=0;i< words.length;i++) {
            if(words[i].length()>longestWord.length()){
                longestWord =words[i];
        }
      }
        return longestWord;
        }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        String result =findLongestWord(s);
        System.out.println("Longest word: " + result);
  }
}
