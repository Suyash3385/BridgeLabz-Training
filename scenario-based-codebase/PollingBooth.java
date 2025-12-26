import java.util.Scanner;
public class PollingBooth{
    public static
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
  
   int candidate1=0,candidate2=0,candidate3=0;
   while(true){
   System.out.println("enter candidate age (or -1 to exit):");
    int age=sc.nextInt();
   if(age==-1){
break;
}
if(age>=18){
           System.out.println("Eligible to vote.");
                System.out.println("Vote for candidate:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                int vote = sc.nextInt();

                
                if(vote==1){
                    candidate1Votes++;
                }
				else if (vote==2){
                    candidate2Votes++;
                } 
				else if (vote==3){
                    candidate3Votes++;
                }
				else {
                    System.out.println("Invalid vote!");
                }

            } 
			else{
                System.out.println("Not eligible to vote ");
          }
        }
        System.out.println("Candidate A Votes " + candidate1Votes);
        System.out.println("Candidate B Votes " + candidate2Votes);
        System.out.println("Candidate C Votes " + candidate3Votes);
}
}