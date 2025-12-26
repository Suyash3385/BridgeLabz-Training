import java.util.Scanner;
public class ResultGenerator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        int subjects=5;
        for(int i=1;i<=subjects; i++){ 
            int marks=sc.nextInt();
            total+=marks;
        }

        // Calculate average
        int average=total/subjects;
        char grade;

        // switch case
        switch (average / 10){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
   }
        System.out.println("Total Marks " + total);
        System.out.println("Average Marks " + average);
        System.out.println("Grade " + grade);
  }
}
