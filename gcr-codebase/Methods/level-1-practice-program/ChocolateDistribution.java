import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        int[] result = { quotient, remainder };
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfChocolates = scanner.nextInt();
        int numberOfChildren = scanner.nextInt();

        // Call method and print the result
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Each child will get " + result[0] + " chocolates");
        System.out.println("Remaining chocolates = " + result[1]);
    }
}
