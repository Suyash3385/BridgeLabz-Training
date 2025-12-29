import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        int secretNumber=random.nextInt(100)+1; 
        int guess;
        int attempts=0;
        int maxAttempts=5;
        boolean guessedCorrectly=false;
        System.out.println("Guess a number between 1 and 100");

           do{
            System.out.print("Enter your guess ");
            guess=sc.nextInt();
            attempts++;

            if(guess==secretNumber){
                guessedCorrectly=true;
                System.out.println("You guessed it right in " + attempts + " attempts");
                break;
            } 
			else if(guess<secretNumber){
                System.out.println(" Too low");
            } 
			else{
                System.out.println(" Too high");
            }
            if(attempts==maxAttempts){
                System.out.println(" reached the maximum attempts ");
                break;
            }

          } while
		(!guessedCorrectly);
         }
}
