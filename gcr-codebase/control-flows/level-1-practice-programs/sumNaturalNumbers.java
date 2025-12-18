//Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct
import java.util.Scanner;
public class sumNaturalNumbers{
   public static void main(String[]args){
    
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	 
	   if (number <= 0) {
            System.out.println("enter natural number");
        } else
		{

            
            int sum = 0;
            int i = 1;
            while (i <= number) {
                sum = sum + i;
                i++;
            }

          
            int formula = number * (number + 1) / 2;

           
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula n*(n+1)/2: " + formula);

            
            if (sum == formula) {
                System.out.println("Both results are equal");
            } else {
                System.out.println("Results are not equal");
            }
        }

      
    }
}
	 
	 
	 


	