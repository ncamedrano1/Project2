package com.titanium.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.titanium.aspect.LoggingAspect;
import com.titanium.models.QuizQuestions;
import com.titanium.models.QuizTemplate;
import com.titanium.models.SubjectFlashCards;
import com.titanium.models.SubjectQuestions;
import com.titanium.repository.SubjectFlashCardsRepository;
import com.titanium.repository.SubjectFlashCardsRepositoryImpl;
import com.titanium.repository.SubjectQuestionsRepository;
import com.titanium.repository.SubjectQuestionsRepositoryImpl;
import com.titanium.repository.SubjectTypesRepositoryImpl;

@Service
public class SubjectQuestionsServiceImpl implements SubjectQuestionsService {

	private SubjectQuestionsRepository subjectQuestionsRepository = new SubjectQuestionsRepositoryImpl();

	private SubjectFlashCardsRepository subjectFlashCardsRepository = new SubjectFlashCardsRepositoryImpl();
	LoggingAspect la = new LoggingAspect();

	public SubjectQuestionsServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Find All questions with their answers & red herrings
	@Override
	public List<SubjectQuestions> findAllQuestions() {
		la.callLog(this);
		System.out.println("Inside findAllQuestions in SubjectQuestionsService Impl");
		return subjectQuestionsRepository.findAll();
	}

	// Use Id to Find all questions from a subject
	@Override
	public List<SubjectQuestions> findAllQuestionsBySubject(Integer id) {
		la.callLog(this);
		return subjectQuestionsRepository.findAllBySubject(id);
	}

	// Use String to Find all questions from a subject
	@Override
	public List<SubjectQuestions> findAllQuestionsBySubject(String subject) {
		la.callLog(this);
		Integer id = new SubjectTypesRepositoryImpl().findSubjectIdByName(subject);
		return subjectQuestionsRepository.findAllBySubject(id);
	}

	// Use Id to find a single question
	@Override
	public SubjectQuestions findQuestion(Integer id) {
		la.callLog(this);
		return subjectQuestionsRepository.findQuestionById(id);
	}

	// Find All questions and return only questions and answers
	@Override
	public List<SubjectFlashCards> findAllFlashCards() {
		la.callLog(this);
		return subjectFlashCardsRepository.findAll();
	}

	// Use Id to Find all flash cards from a subject
	@Override
	public List<SubjectFlashCards> findAllFlashCardsBySubject(Integer id) {
		la.callLog(this);
		return subjectFlashCardsRepository.findAllBySubject(id);
	}

	// Use String to final all flash cards from a subject
	@Override
	public List<SubjectFlashCards> findAllFlashCardsBySubject(String subject) {
		la.callLog(this);
		Integer id = new SubjectTypesRepositoryImpl().findSubjectIdByName(subject);
		return subjectFlashCardsRepository.findAllBySubject(id);
	}

	// Find a single flash card with Id
	@Override
	public SubjectFlashCards findFlashCard(Integer id) {
		la.callLog(this);
		return subjectFlashCardsRepository.findFlashCardById(id);
	}

	@Override
	public List<QuizQuestions> getQuiz(Integer quizSize, String... quizType) {
		la.callLog(this);
		List<SubjectQuestions> questions = new ArrayList<SubjectQuestions>();
		for (String qt : quizType) {
			questions.addAll(findAllQuestionsBySubject(qt));
		}
		List<QuizQuestions> newQuiz = new QuizTemplate().randomizeQuiz(quizSize, questions);
		return newQuiz;
	}

	@Override
	public List<QuizQuestions> getQuiz(Integer quizSize, Integer... quizType) {
		la.callLog(this);
		List<SubjectQuestions> questions = new ArrayList<SubjectQuestions>();
		for (Integer i : quizType) {
			System.out.println("getting questions of type: " + new SubjectTypesRepositoryImpl().findSubjectNameById(i));
			questions.addAll(findAllQuestionsBySubject(i));
		}
		List<QuizQuestions> newQuiz = new QuizTemplate().randomizeQuiz(quizSize, questions);
		return newQuiz;
	}
}
