package com.titanium.services;

import java.util.List;

import com.titanium.models.QuizQuestions;
import com.titanium.models.SubjectFlashCards;
import com.titanium.models.SubjectQuestions;

public interface SubjectQuestionsService {

	// Find All questions with their answers & red herrings
	List<SubjectQuestions> findAllQuestions();

	// Use Id to Find all questions from a subject
	List<SubjectQuestions> findAllQuestionsBySubject(Integer id);

	// Use String to Find all questions from a subject
	List<SubjectQuestions> findAllQuestionsBySubject(String subject);

	// Use Id to find a single question
	SubjectQuestions findQuestion(Integer id);

	// Find All questions and return only questions and answers
	List<SubjectFlashCards> findAllFlashCards();

	// Use Id to Find all flash cards from a subject
	List<SubjectFlashCards> findAllFlashCardsBySubject(Integer id);

	// Use String to final all flash cards from a subject
	List<SubjectFlashCards> findAllFlashCardsBySubject(String subject);

	// Find a single flash card with Id
	SubjectFlashCards findFlashCard(Integer id);

	List<QuizQuestions> getQuiz(Integer quizSize, Integer... quizType);

	List<QuizQuestions> getQuiz(Integer quizSize, String... quizType);

}