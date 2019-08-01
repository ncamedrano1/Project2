package com.titanium.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.titanium.models.QuizQuestions;
import com.titanium.models.SubjectFlashCards;
import com.titanium.models.SubjectQuestions;
import com.titanium.services.SubjectQuestionsService;
import com.titanium.services.SubjectQuestionsServiceImpl;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/questions")
public class SubjectQuestionsControllerImpl {

	private SubjectQuestionsService subjectQuestionsService = new SubjectQuestionsServiceImpl();

	@RequestMapping("/allQuestions")
	public @ResponseBody List<SubjectQuestions> getAllQuestions() {
		return subjectQuestionsService.findAllQuestions();
	}

	@RequestMapping("/allQuestions-{subject}")
	public @ResponseBody List<SubjectQuestions> getAllQuestionsBySubject(@PathVariable("subject") String subject) {
		return subjectQuestionsService.findAllQuestionsBySubject(subject);
	}

//	@RequestMapping("/allQuestions-{subject}")
//	public @ResponseBody List<SubjectQuestions> getAllQuestionsBySubject(@PathVariable("subject") int subject) {
//		return subjectQuestionsService.findAllQuestionsBySubject(subject);
//	}

	@RequestMapping("/allFlashCards")
	public @ResponseBody List<SubjectFlashCards> getAllFlashCards() {
		return subjectQuestionsService.findAllFlashCards();
	}

	@RequestMapping("/allFlashCards-{subject}")
	public @ResponseBody List<SubjectFlashCards> getAllFlashCardsBySubject(@PathVariable("subject") String subject) {
		return subjectQuestionsService.findAllFlashCardsBySubject(subject);
	}

//	@RequestMapping("/allFlashCards-{subject}")
//	public @ResponseBody List<SubjectFlashCards> getAllFlashCardsBySubject(@PathVariable("subject") int subject) {
//		return subjectQuestionsService.findAllFlashCardsBySubject(subject);
//	}

	@RequestMapping("/getQuiz-{size}-{subject}")
	public @ResponseBody List<QuizQuestions> getQuiz(@PathVariable("size") int size,
			@PathVariable("subject") String subject) {
		return subjectQuestionsService.getQuiz(size, subject);
	}

}