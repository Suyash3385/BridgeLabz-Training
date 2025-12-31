import java.util.Scanner;

public class OnlineQuiz{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String[] questions={
            "1. Which keyword is used to inherit a class in Java?",
            "2. Which data type is used to store true/false values?",
            "3. Which method is the entry point of a Java program?",
            "4. Which operator is used for logical AND?",
            "5. Which collection does not allow duplicate elements?"
        };

        String[][]options={
            {"A. extends", "B. implements",},
            {"A. int", "B. boolean",}, {"A. start()", "B. main()", },
            {"A. &", "B. |"},{"A. List", "B. Set",}};

        int score=0;
        for (int i=0;i<questions.length;i++) {
            System.out.println(questions[i]);

            for(int j=0;j<options[i].length; j++){
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B): ");
            char answer=sc.next().toUpperCase().charAt(0);

            switch(i){
                 case 0:
                    if(answer=='A')score++;
                    break;
                case 1:
                    if(answer=='B')score++;
                    break;
                case 2:
                    if(answer=='C')score++;
                    break;
                case 3:
                    if(answer=='C')score++;
                    break;
                case 4:
                    if(answer=='C')score++;
                    break;
      }
      }      
        System.out.println(" Quiz Completed");
        System.out.println("Your Score: " +score+ " / " + questions.length);
   }
   }
