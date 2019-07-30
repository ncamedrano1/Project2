package com.titanium.models;

import org.springframework.stereotype.Component;

@Component("subjectQuestion")
public class SubjectQuestions {
	private Integer question_id;
	private Integer subject_id;
	private String question;
	private String answer;
	private String red_herring_one;
	private String red_herring_two;
	private String red_herring_three;
	private String red_herring_four;
	private String red_herring_five;
	private String red_herring_six;

	public SubjectQuestions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubjectQuestions(Integer question_id, Integer subject_id, String question, String answer,
			String red_herring_one, String red_herring_two, String red_herring_three, String red_herring_four,
			String red_herring_five, String red_herring_six) {
		super();
		this.question_id = question_id;
		this.subject_id = subject_id;
		this.question = question;
		this.answer = answer;
		this.red_herring_one = red_herring_one;
		this.red_herring_two = red_herring_two;
		this.red_herring_three = red_herring_three;
		this.red_herring_four = red_herring_four;
		this.red_herring_five = red_herring_five;
		this.red_herring_six = red_herring_six;
	}

	@Override
	public String toString() {
		return "SubjectQuestions [question_id=" + question_id + ", subject_id=" + subject_id + ", question=" + question
				+ ", answer=" + answer + ", red_herring_one=" + red_herring_one + ", red_herring_two=" + red_herring_two
				+ ", red_herring_three=" + red_herring_three + ", red_herring_four=" + red_herring_four
				+ ", red_herring_five=" + red_herring_five + ", red_herring_six=" + red_herring_six + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((question_id == null) ? 0 : question_id.hashCode());
		result = prime * result + ((red_herring_five == null) ? 0 : red_herring_five.hashCode());
		result = prime * result + ((red_herring_four == null) ? 0 : red_herring_four.hashCode());
		result = prime * result + ((red_herring_one == null) ? 0 : red_herring_one.hashCode());
		result = prime * result + ((red_herring_six == null) ? 0 : red_herring_six.hashCode());
		result = prime * result + ((red_herring_three == null) ? 0 : red_herring_three.hashCode());
		result = prime * result + ((red_herring_two == null) ? 0 : red_herring_two.hashCode());
		result = prime * result + ((subject_id == null) ? 0 : subject_id.hashCode());
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
		SubjectQuestions other = (SubjectQuestions) obj;
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
		if (question_id == null) {
			if (other.question_id != null)
				return false;
		} else if (!question_id.equals(other.question_id))
			return false;
		if (red_herring_five == null) {
			if (other.red_herring_five != null)
				return false;
		} else if (!red_herring_five.equals(other.red_herring_five))
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
		if (red_herring_six == null) {
			if (other.red_herring_six != null)
				return false;
		} else if (!red_herring_six.equals(other.red_herring_six))
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
		if (subject_id == null) {
			if (other.subject_id != null)
				return false;
		} else if (!subject_id.equals(other.subject_id))
			return false;
		return true;
	}

	public Integer getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Integer question_id) {
		this.question_id = question_id;
	}

	public Integer getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
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

	public String getRed_herring_five() {
		return red_herring_five;
	}

	public void setRed_herring_five(String red_herring_five) {
		this.red_herring_five = red_herring_five;
	}

	public String getRed_herring_six() {
		return red_herring_six;
	}

	public void setRed_herring_six(String red_herring_six) {
		this.red_herring_six = red_herring_six;
	}

}
