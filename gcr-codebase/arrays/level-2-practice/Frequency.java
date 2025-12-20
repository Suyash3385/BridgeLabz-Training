// Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        //Take two variables and initialize count with 0
        int temp = number;
        int count = 0;

        // Count digits of a number
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Store digits in array and take another variable index initialize it with 0
        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        //  Make another Frequency array
        int[] frequency = new int[10];
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " = " + frequency[i]);
            }
        }
    }
}
