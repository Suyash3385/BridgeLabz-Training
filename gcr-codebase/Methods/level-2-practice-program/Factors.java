import java.util.Scanner;

public class Factors{
    public static int[] findFactors(int number) {
        int count = 0;
        // count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
          }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
         }
        }
      return factors;
    }

    // Method to find sum 
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to find product 
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
      }
    // Method to find sum of squares 
    public static double findSumOfSquares(int[] factors) {
        double sumSquares = 0;
        for (int i = 0; i < factors.length; i++) {
            sumSquares += Math.pow(factors[i], 2);
        }
        return sumSquares;
       }

        public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println( findSum(factors));
        System.out.println( findProduct(factors));
        System.out.println(findSumOfSquares(factors));
     }
}










