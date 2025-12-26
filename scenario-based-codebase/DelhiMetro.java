import java.util.Scanner;
public class DelhiMetro{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=100; 
        int choice;

        while(balance>0){
            int distance=sc.nextInt();

            // Fare calculation using ternary operator
            int fare=(distance<=5) ? 10 :
                       (distance <= 15) ? 20 : 30;

            if(balance>=fare){
                balance-=fare;
                System.out.println("Fare deducted"+ fare);
                System.out.println("Remaining balance"+ balance);
            }
			else {
                System.out.println("Insufficient balance");
                break;
            }

            System.out.print("Press 1 to continue or 0 to quit ");
            choice=sc.nextInt();

            if(choice==0){
                break;
          }
     }
    }
}
