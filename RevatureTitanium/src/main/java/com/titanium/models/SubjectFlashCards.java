package com.titanium.models;

import org.springframework.stereotype.Component;

@Component("subjectFlashCard")
public class SubjectFlashCards {
	private Integer question_id;
	private Integer subject_id;
	private String question;
	private String answer;

	public SubjectFlashCards() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubjectFlashCards(Integer question_id, Integer subject_id, String question, String answer) {
		super();
		this.question_id = question_id;
		this.subject_id = subject_id;
		this.question = question;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "SubjectFlashCards [question_id=" + question_id + ", subject_id=" + subject_id + ", question=" + question
				+ ", answer=" + answer + "]";
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

}
