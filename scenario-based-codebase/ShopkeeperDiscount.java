import java.util.Scanner;

public class ShopkeeperDiscount{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

double total=0.0;
 
int items=sc.nextInt();
final  double discount1=0.10;
final  double discount2=0.15;
final  double discount3=0.20;



for(int i=0;i<=items;i++){
double price=sc.nextDouble();
total+=price;
}
double discount=0.0;
if(total>=4000){
discount=total*discount3;
}
else if(total>=3000){
discount=total*discount2;
}
else if(total>=1500){
discount=total*discount1;
}
else{
discount=0.0;
}
double finalAmount=total-discount;
System.out.println("total bill" +total);
System.out.println("discount applied" +discount);
System.out.println("amount to pay" +finalAmount);


}
}