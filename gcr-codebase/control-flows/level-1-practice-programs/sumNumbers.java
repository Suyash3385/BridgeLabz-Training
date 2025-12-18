//Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers.
import java.util.Scanner;
public class sumNumbers{
   public static void main(String[]args){
   
    Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	if (number <= 0) {
            System.out.println("enter natural number");
        } else{
		 int sum = 0;
		 for(int i=1;i<=number;i++){
		 sum+=i;
		 }
		 int formula = number * (number + 1) / 2;
		   System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula n*(n+1)/2: " + formula);
			
			 if (sum == formula) {
                System.out.println("Both results are equal");
            } else {
                System.out.println("Results are not equal");
            }
        }
	}
}	
	
