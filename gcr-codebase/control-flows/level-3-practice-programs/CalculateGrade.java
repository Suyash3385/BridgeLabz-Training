import java.util.Scanner;
public class CalculateGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        // Calculate the  total and percentage
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        //create two variables 
        char grade;
        String remarks;

        // calculate grade and remarks
        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching standards";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below standards";
        } else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        
        System.out.println("Result");
        System.out.println("Average Marks " + percentage);
        System.out.println("Grade " + grade);
        System.out.println("Remarks " + remarks);

    
    }
	}