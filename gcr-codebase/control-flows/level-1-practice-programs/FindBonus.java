//Create a program to find the bonus of employees based on their years of service.
import java.util.Scanner;
public class FindBonus{
   public static void main(String[] args){
   
   Scanner sc=new Scanner(System.in);
    double salary = sc.nextDouble();
     int yearsOfService = sc.nextInt();

        double bonus = 0.0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05;   
        }

        System.out.println("Bonus amount = " + bonus);
		}
}		
   