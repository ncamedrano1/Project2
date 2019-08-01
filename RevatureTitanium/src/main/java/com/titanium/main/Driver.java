package com.titanium.main;

import com.titanium.models.QuizTemplate;
import com.titanium.repository.SubjectQuestionsRepository;
import com.titanium.repository.SubjectQuestionsRepositoryImpl;
import com.titanium.repository.SubjectTypesRepository;
import com.titanium.repository.SubjectTypesRepositoryImpl;
import com.titanium.services.SubjectQuestionsService;
import com.titanium.services.SubjectQuestionsServiceImpl;
import com.titanium.services.SubjectTypesService;
import com.titanium.services.SubjectTypesServiceImpl;

public class Driver {

	public static void main(String[] args) {
		SubjectTypesService subServ = new SubjectTypesServiceImpl();
//		System.out.println(subServ.findAll());

		SubjectTypesRepository subRepo = new SubjectTypesRepositoryImpl();
//		System.out.println("Subject Name By Id");
//		System.out.println(subRepo.findSubjectNameById(2));
		System.out.println(subRepo.findOneSubjectById(1).toString());
//		System.out.println(subRepo.findOneSubjectById(2).toString());
//		System.out.println(subRepo.findSubjectIdByName("JAva"));

		SubjectQuestionsService questServ = new SubjectQuestionsServiceImpl();

//		System.out.println(questServ.findAllQuestions());

		SubjectQuestionsRepository questRepo = new SubjectQuestionsRepositoryImpl();
//		System.out.println(questRepo.findQuestionById(199));

		System.out.println(questServ.getQuiz(5, 1));

//		System.out.println(questServ.findAllFlashCardsBySubject(7));

//		QuizTemplate qt = new QuizTemplate();
//		System.out.println(qt.getRandomFromRange(0, 5));
//		System.out.println(qt.getRandomFromRange(0, 5));
//		System.out.println(qt.getRandomFromRange(0, 5));
//		System.out.println(qt.getRandomFromRange(0, 5));
//		System.out.println(qt.getRandomFromRange(0, 5));
	}
}
