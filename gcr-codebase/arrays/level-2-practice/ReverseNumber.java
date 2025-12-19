//Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
import java.util.Scanner;
public class ReverseNumber{
   public static void main(String[]args){
   
   Scanner sc=new Scanner(System.in);
   int number=sc.nextInt();
   int temp=number;
   int count=0;
   
   while(temp>0){
      count++;
  temp=temp/10;
}
   int array[]=new int [count];
   temp=number;
   for(int i=0;i<count;i++){
   array[i]=temp%10;
   temp=temp/10;
   }
   int reverse[]= new int[count];
   for(int i=0;i<count;i++){
   reverse[i]=array[count-1-i];
   }
      for(int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }
   }
}   