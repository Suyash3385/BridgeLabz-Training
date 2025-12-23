//Write a program to find the frequency of characters in a string using the charAt() method and display the result
import java.util.Scanner;
public class FreqChar{
   public static int countFreq(String text){
   int freq[]=new int[256];
   //count frequency
   for(int i=0;i<text.length();i++){
   char ch=text.charAt(i);
   freq[ch++];
   }
       int uniqueCount=0;
        for (int i=0; i<256;i++){
            if(freq[i]>0){
                uniqueCount++;
            }
          }
		    String[][]charFreqArray=new String[uniqueCount][2];
        int index=0;
        for(int i=0;i< 256;i++){
            if (freq[i]>0) {
                charFreqArray[index][0] =String.valueOf((char) i); 
                charFreqArray[index][1] =String.valueOf(freq[i]);   
                index++;
          }
         }

        return charFreqArray;
      }
   
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
        String text = sc.nextLine();
        String[][]result= findFrequency(text);
        displayTable(result);
		}
		}