//Create a program to find the maximum number of handshakes among students.
import java.util.Scanner;
public class MaximumHandshakes{
    public static int NumberHandshakes(int numberOfStudents){
	int combination=(numberOfStudents * (numberOfStudents - 1)) / 2 ;
	return combination;
	}
   public static void main(String[]args){
   
     Scanner sc=new Scanner(System.in);
    int numberOfStudents=sc.nextInt();
	 
	 int result=NumberHandshakes(numberOfStudents);
	 System.out.println(result);
	 }
	} 
	