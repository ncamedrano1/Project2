package com.titanium.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titanium.models.SubjectQuestions;
import com.titanium.repository.SubjectQuestionsRepository;
import com.titanium.repository.SubjectQuestionsRepositoryImpl;

@Service
public class SubjectQuestionsServiceImpl {

	@Autowired
	private SubjectQuestionsRepository subjectQuestionsRepository = new SubjectQuestionsRepositoryImpl();

	public SubjectQuestionsServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<SubjectQuestions> findAll() {
		return subjectQuestionsRepository.findAll();
	}

	public List<SubjectQuestions> findAllBySubject(Integer id) {
		return subjectQuestionsRepository.findAllBySubject(id);
	}

	public List<SubjectQuestions> findAllBySubject(String subject) {

//		return subjectQuestionsRepository.findAllBySubject(subject);
		return null;
	}

	public List<SubjectQuestions> findAllQuestionsAndAnswers() {
		// Return just Questions and Answers?
		return null;
	}

	public List<SubjectQuestions> findAllQuestionsAndAnswersBySubject() {
		// Return just Questions and Answers by SubjectType
		return null;
	}
	
	/*
	 * NEED:
	 * GRADE QUIZ:
	 * *Temporary Map of Quiz questions, red herrings & answer to view on frontend
	 * 
	 */
}
