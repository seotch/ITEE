package exercise;

public abstract class AbstractExercise implements Exercise{

	protected String question;
	protected String answer;

	public String getAnswer() {
		return this.answer;		
	}

	public String getQuestion() {
		return this.question;
	}
	
	public abstract void init();


}