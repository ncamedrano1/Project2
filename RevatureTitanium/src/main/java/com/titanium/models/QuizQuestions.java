package com.titanium.models;

public class QuizQuestions {
	private String question;
	private String answer;
	private String red_herring_one;
	private String red_herring_two;
	private String red_herring_three;
	private String red_herring_four;

	public QuizQuestions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuizQuestions(String question, String answer, String red_herring_one, String red_herring_two,
			String red_herring_three, String red_herring_four) {
		super();
		this.question = question;
		this.answer = answer;
		this.red_herring_one = red_herring_one;
		this.red_herring_two = red_herring_two;
		this.red_herring_three = red_herring_three;
		this.red_herring_four = red_herring_four;
	}

	@Override
	public String toString() {
		return "QuizQuestionTemplate [question=" + question + ", answer=" + answer + ", red_herring_one="
				+ red_herring_one + ", red_herring_two=" + red_herring_two + ", red_herring_three=" + red_herring_three
				+ ", red_herring_four=" + red_herring_four + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((red_herring_four == null) ? 0 : red_herring_four.hashCode());
		result = prime * result + ((red_herring_one == null) ? 0 : red_herring_one.hashCode());
		result = prime * result + ((red_herring_three == null) ? 0 : red_herring_three.hashCode());
		result = prime * result + ((red_herring_two == null) ? 0 : red_herring_two.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuizQuestions other = (QuizQuestions) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (red_herring_four == null) {
			if (other.red_herring_four != null)
				return false;
		} else if (!red_herring_four.equals(other.red_herring_four))
			return false;
		if (red_herring_one == null) {
			if (other.red_herring_one != null)
				return false;
		} else if (!red_herring_one.equals(other.red_herring_one))
			return false;
		if (red_herring_three == null) {
			if (other.red_herring_three != null)
				return false;
		} else if (!red_herring_three.equals(other.red_herring_three))
			return false;
		if (red_herring_two == null) {
			if (other.red_herring_two != null)
				return false;
		} else if (!red_herring_two.equals(other.red_herring_two))
			return false;
		return true;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getRed_herring_one() {
		return red_herring_one;
	}

	public void setRed_herring_one(String red_herring_one) {
		this.red_herring_one = red_herring_one;
	}

	public String getRed_herring_two() {
		return red_herring_two;
	}

	public void setRed_herring_two(String red_herring_two) {
		this.red_herring_two = red_herring_two;
	}

	public String getRed_herring_three() {
		return red_herring_three;
	}

	public void setRed_herring_three(String red_herring_three) {
		this.red_herring_three = red_herring_three;
	}

	public String getRed_herring_four() {
		return red_herring_four;
	}

	public void setRed_herring_four(String red_herring_four) {
		this.red_herring_four = red_herring_four;
	}

}
