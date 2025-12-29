import java.util.Scanner;
public class PhoneRecharge{
  public static void main(String[]args){
  
  Scanner sc=new Scanner(System.in);
 double balance=0.0;
  String  offer;
 do {
 System.out.println("enter your operator");
 String operator=sc.next();
 
 System.out.println("enter the amount");
 int amount=sc.nextInt();

balance+=amount;
switch(operator.toLowerCase()){
case "jio": 
 System.out.println("2gb/day + unlimited calls");
 break;
 case "airtel":
 System.out.println("1.5/day + unlimited calls for 28 days");
 break;
 default:
 System.out.println("invalid");
 }
 System.out.println("current balance :"+ balance);
 
 System.out.println("do you want to recharge again");
 offer =sc.next();
 }
 while(offer.equalsIgnoreCase("yes"));
 
 }
 }
 
 
  
  