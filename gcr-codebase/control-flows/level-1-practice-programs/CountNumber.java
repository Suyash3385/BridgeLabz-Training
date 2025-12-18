//Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
import java.util.Scanner;
public class CountNumber{
   public static void main(String[]args){
   
   Scanner sc=new Scanner(System.in);
      int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
			
			// decrement counter
            counter--;   
        }
   }
}   