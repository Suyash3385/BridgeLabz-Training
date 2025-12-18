//Create a program to print odd and even numbers between 1 to the number entered by the user.
import java.util.Scanner;
public class EvenOdd{
   public static void main(String[]args){
    
	//Take the input number from the user
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	
	//check for the even and odd numbers
	for(int i=1;i<number;i++){
	if(i%2==0{
	System.out.println("even");
	}
	else{
	System.out.println("odd");
	}
  }
}