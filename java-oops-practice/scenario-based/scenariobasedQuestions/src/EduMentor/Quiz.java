package EduMentor;

public class Quiz {
	private String [] questions;
	private String [] answers;
	private int score;
	Quiz(String questions[],String answers[]){
		this.questions=questions;
		this.answers=answers;
		this.score=0;
	}
	public void submitAnswers(String[] userAnswers) {
		for(int i=0;i<answers.length;i++) {
			if(answers[i].equalsIgnoreCase(userAnswers[i])) {
				score++;
			}
		}
	}
public double calculatePercentage() {
	return (score*100)/answers.length;
}
public int getScore() {
	return score;
	
}
}
