package com.titanium.repository;

import java.util.List;

import com.titanium.models.SubjectFlashCards;

public interface SubjectFlashCardsRepository {

	List<SubjectFlashCards> findAll();

	// Find a single question from a specific subject
	SubjectFlashCards findFlashCardById(Integer id);

	List<SubjectFlashCards> findAllBySubject(Integer id);

}