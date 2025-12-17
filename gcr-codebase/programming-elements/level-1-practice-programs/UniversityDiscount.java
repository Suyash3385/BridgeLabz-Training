public class UniversityDiscount{
public static void main(String []args){
double fee=125000;
double discountPercent=10;
double discountAmount=(discountPercent*fee)/100;
double discountFee=fee-discountAmount;
System.out.println("The discount amount is INR "+ discountAmount+" and final discounted fee is INR "+ discountFee);

}
}