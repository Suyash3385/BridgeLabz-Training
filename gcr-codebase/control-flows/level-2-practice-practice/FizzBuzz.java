//Write a program FizzBuzz, take a number as user input, and check for a positive integer. If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
import java.util.Scanner;
public class FizzBuzz{
  public static void main(String[]args){
  
  //Take the input from the user and make the scanner object
  Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
	
	//check whether the number is positive or not
	
        if (number <= 0) {
            System.out.println("Enter a valid positive number.");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
  }
}