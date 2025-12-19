//Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
import java.util.Scanner;
public class MultiDimensionalArray{
   public static void main(String[]args){
   
   Scanner sc=new Scanner(System.in);
   
   //Take two variables input
   int rows=sc.nextInt();
   int columns=sc.nextInt();
   
   //create two dimensional array
   int matrix[][]=new int[rows][columns];
   for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
	  matrix[i][j]=sc.nextInt();
	  }
	}  
	int array[]=new int[rows*columns];
	int index=0;
	
	// Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
	}
}
   