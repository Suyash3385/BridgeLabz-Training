import java.util.Scanner;
public class Temperature{
public static double celciusToFahrenheit(double celsius){
return (celsius * 9 / 5) + 32;
}
public static double fahrenheitToCelsius(double fahrenheit){
return (fahrenheit - 32) * 5 / 9;
}
  public static void main(String[]args){
  
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter temperature in Celsius ");
        double celsius=sc.nextDouble();
        System.out.println(celsius + "C = " + celsiusToFahrenheit(celsius) + "F");

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit =sc.nextDouble();
        System.out.println(fahrenheit + "F = " + fahrenheitToCelsius(fahrenheit) + "C");
  }
  }
  