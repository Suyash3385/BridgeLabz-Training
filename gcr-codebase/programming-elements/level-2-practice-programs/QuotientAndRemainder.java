import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers from the user
        
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        // find the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

     
        System.out.println("The Quotient is " + quotient +
                           " and Reminder is " + remainder +
                           " of two number " + number1 + " and " + number2);

       
    }
}
