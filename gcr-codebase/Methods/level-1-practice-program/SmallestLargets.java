//Write a program to find the smallest and the largest of the 3 numbers.
import java.util.Scanner;
public class SmallestLargets{
    public static int FindLargestSmallest(int number1,int number2,int number3){
           if (number1 <= number2 && number1 <= number3) {
            return number1;
        } else if (number2 <= number1 && number2 <= number3) {
            return number2;
        } else {
            return number3;
        }
    }
   public static void main(String[]args){
   
   Scanner sc=new Scanner(System.in);
   int number1=sc.nextInt();
   int number2=sc.nextInt();
   int number3=sc.nextInt();
   int result=FindLargestSmallest(number1,number2,number3);
   System.out.println(result);
   }
  } 
   

