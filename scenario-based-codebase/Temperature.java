import java.util.Scanner;
public class Temperature{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int temp[]=new int[7];
  for(int i=0;i<7;i++){
  temp[i]=sc.nextInt();
  }
  int max=temp[0];
  int sum=0;
  
  //maximum temperature
  for(int i=0;i<temp.length;i++){
  if(temp[i]>max){
  max=temp[i];
  }
  }
  //average of temp
  for(int i=0;i<temp.length;i++){
  sum+=temp[i];
  }
  int avg=sum/temp.length;
  
  System.out.println("maximum temperature is :" + max);
  System.out.println("Average of temperature is :" + avg);
  }
  }
  
  