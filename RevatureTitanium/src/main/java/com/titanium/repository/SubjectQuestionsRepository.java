package com.titanium.repository;

import java.util.List;

import com.titanium.models.SubjectQuestions;

public interface SubjectQuestionsRepository {

	List<SubjectQuestions> findAll();

	public SubjectQuestions findQuestionById(Integer id);

	List<SubjectQuestions> findAllBySubject(Integer id);

}