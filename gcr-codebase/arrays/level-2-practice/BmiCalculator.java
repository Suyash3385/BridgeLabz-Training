//An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
import java.util.Scanner;
public class BmiCalculator{
   public static void main(String[]args){
   
   Scanner sc=new Scanner(System.in);
   int number=sc.nextInt();
   double height[]=new double[number];
    double weight[]=new double[number];
	 double bmi[]=new double[number];
	  String weightStatus[]=new String[number];
	  
	  //take input for the weight and height of persons
	  for(int i=0;i<number;i++){
	  weight[i]=sc.nextDouble();
	  height[i]=sc.nextDouble();
	  }
	  
	  //calculate the bmi of a persons
	  for(int i=0;i<number;i++){
	  bmi[i]=weight[i]/height[i]*height[i];
	  if(bmi[i]<=18.4){
	 weightStatus[i]="Underweight";
	  }
	  else if(bmi[i]>=18.4 && bmi[i]<=24.9){
	  weightStatus[i]="normal";
	  }
	  else if(bmi[i]>=25.0 && bmi[i]<=39.9){
	  weightStatus[i]="overweight";
	  
	  }
	  else {
	 weightStatus[i]="obese";
	  }
	  }
	  
	  for(int i=0;i<number;i++){
	  System.out.println("Height of a person is:" + height[i]);
	   System.out.println("Height of a person is:" + weight[i]);
	    System.out.println("Height of a person is:" + bmi[i]);
		 System.out.println("Height of a person is:" + weightStatus[i]);
		 }
	}	 
}		 
	  