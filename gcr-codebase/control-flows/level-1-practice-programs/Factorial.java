//Write a Program to find the factorial of an integer entered by the user.


public class Factorial{
   public static void main(String[]args){
   
   int number=Integer.parseInt(args[0]);
   int fact=1;
   if(number<=0){
   System.out.println("enter natural number");
   }
   else{
         while (number > 0) {
                fact = fact * number;
                number--;
            
   }
   System.out.println(fact);
   }
} 
}  