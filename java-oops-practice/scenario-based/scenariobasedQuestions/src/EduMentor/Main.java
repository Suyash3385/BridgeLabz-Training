package EduMentor;

public class Main{
    public static void main(String[] args) {

        Learner l = new Learner("Suyash","suyash@gmail.com", 16);
        l.displayRole();

        String[] questions={"What is Java?","What is OOPS?"};

        String[] correctAnswers={"programming language","object oriented programming language"};

        Quiz q=new Quiz(questions, correctAnswers);

        String[] answers={"programming language","object oriented programming language"};

        q.submitAnswers(answers);

        System.out.println("Score: " + q.getScore());
        System.out.println("Percentage: " + q.calculatePercentage() + "%");

        ICertifiable course1 = new ShortCourse();
        ICertifiable course2 = new FullCourse();
        course1.generateCertificate();
        course2.generateCertificate();
    }
}
