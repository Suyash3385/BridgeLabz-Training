import java.util.Scanner;

public class HeightConversion
{  
    public static void main(String[] args)
    {
       //Take the input
        
        Scanner input = new Scanner(System.in); 

        //taking user input
        double heightCm = input.nextDouble(); 
        
        double totalInches = heightCm / 2.54; 
        int feet = (int)(totalInches / 12);


        //calculating remaining inches
        double inches = totalInches % 12;     
        
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + inches); 
    }
}
