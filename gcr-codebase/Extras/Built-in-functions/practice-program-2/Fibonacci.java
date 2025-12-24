import java.util.Scanner;
public class Fibonacci{
public static void printFibonacci(int number){
int a=0,b=1;
while(a<=number){
int next=a+b;
a=b;
b=next;
}
System.out.println();
}


   public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   int number=sc.nextInt();
 printFibonacci(number);
  
   
   }
   }