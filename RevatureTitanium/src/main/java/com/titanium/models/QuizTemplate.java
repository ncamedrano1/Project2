package com.titanium.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.testng.log4testng.Logger;

public class QuizTemplate {
	private List<QuizQuestions> quiz;

	private static List<Integer> answers;

	public List<QuizQuestions> randomizeQuiz(Integer quizSize, List<SubjectQuestions> allQuestions) {
		// This is what will be returned to FrontEnd
		quiz = new ArrayList<QuizQuestions>();

		// This will be used to check for answers on current quiz
		answers = new ArrayList<Integer>();

		// This is a list of all Questions to include in this quiz
		List<SubjectQuestions> quizQuestions = new ArrayList<SubjectQuestions>();

		// check if there are more questions than the desired quiz size
		if (allQuestions.size() > quizSize) {
			System.out.println("Expected Quiz size: " + quizSize);
			System.out.println("Questions in selected Subject: " + allQuestions.size());
			// If so, populate a list with random questions from all questions
			for (int i = 0; i < quizSize; i++) {
				// get a random question from all questions
				int rand = getRandomFromRange(0, allQuestions.size() - 1);
				System.out.println("Random Number: " + rand);
				// add the random question to quiz questions
				quizQuestions.add(allQuestions.get(rand));

				// remove that question from all questions so we don't have duplicates
				allQuestions.remove(rand);
			}
		} else {
			System.out.println("There are less questions retrieved than size of quiz wanted");
		}

		if (quizQuestions.size() > 0) {
			// For each question in all quiz questions, iterate through for question, answer
			// and 4 red herrings
			for (SubjectQuestions sq : quizQuestions) {
				// make a list of Integers to represent all redHerrings, 1-6
				List<Integer> redHerringsTemp = new ArrayList<Integer>();
				for (int i = 1; i < 7; i++) {
					redHerringsTemp.add(i);
				}

				// make a list with indexes for answer, and 4 red herrings
				List<Integer> quizChoices = new ArrayList<Integer>();

				System.out.println(redHerringsTemp);
				// add 4 other integers between 1 and 6
				for (int i = 0; i < 4; i++) {
					int rand = getRandomFromRange(1, redHerringsTemp.size() - 1);
					quizChoices.add(redHerringsTemp.get(rand));
					redHerringsTemp.remove(rand);
				}

				System.out.println(quizChoices);
				// Create a temp String array to populate the Quiz List Array
				QuizQuestions qtemp = new QuizQuestions();

				// Set the first String as the Question
				qtemp.setQuestion(sq.getQuestion());
				qtemp.setAnswer(sq.getAnswer());
				qtemp.setRed_herring_one(getChoice(quizChoices.get(0), sq));
				qtemp.setRed_herring_two(getChoice(quizChoices.get(1), sq));
				qtemp.setRed_herring_three(getChoice(quizChoices.get(2), sq));
				qtemp.setRed_herring_four(getChoice(quizChoices.get(3), sq));

				// Add the qtemp string array to quiz to return to client
				quiz.add(qtemp);
			}
		}
		// return populated quiz
		return quiz;
	}

	// Get a random number from a range
	public int getRandomFromRange(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}

	// Switch case to get red herring, or answer
	public String getChoice(int choiceIndex, SubjectQuestions question) {
		switch (choiceIndex) {

		// if Case 0, populate as answer, and add the index (in quiz) to list of answers
		case 0:
			return question.getAnswer();
		case 1:
			return question.getRed_herring_one();
		case 2:
			return question.getRed_herring_two();
		case 3:
			return question.getRed_herring_three();
		case 4:
			return question.getRed_herring_four();
		case 5:
			return question.getRed_herring_five();
		case 6:
			return question.getRed_herring_six();
		default:
			return null;
		}
	}
}
