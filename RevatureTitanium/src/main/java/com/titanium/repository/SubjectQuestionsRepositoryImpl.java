package com.titanium.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.titanium.configuration.JdbcConfig;
import com.titanium.models.SubjectQuestions;
import com.titanium.models.SubjectQuestionsMapper;

@Repository
public class SubjectQuestionsRepositoryImpl implements SubjectQuestionsRepository {

	@Autowired
	private DataSource dataSource = new JdbcConfig().dataSource();
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

	@PostConstruct
	private void postConstruct() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// Find all Questions
	@Override
	public List<SubjectQuestions> findAll() {
		System.out.println("findAll inside :: " + this.getClass().getName());

		String query = "SELECT * FROM subjects_questions";
		List<SubjectQuestions> result = new ArrayList<SubjectQuestions>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);
		for (Map row : rows) {
			SubjectQuestions question = new SubjectQuestions();
			question.setQuestion_id((Integer) row.get("question_id"));
			question.setSubject_id((Integer) row.get("subject_id"));
			question.setQuestion((String) row.get("question"));
			question.setAnswer((String) row.get("answer"));
			question.setRed_herring_one((String) row.get("red_herring_one"));
			question.setRed_herring_two((String) row.get("red_herring_two"));
			question.setRed_herring_three((String) row.get("red_herring_three"));
			question.setRed_herring_four((String) row.get("red_herring_four"));
			question.setRed_herring_five((String) row.get("red_herring_five"));
			question.setRed_herring_six((String) row.get("red_herring_six"));

			result.add(question);
		}
		return result;
	}

	// Find a single question from a specific subject
	public SubjectQuestions findQuestionById(Integer id) {
		String query = "SELECT * FROM subjects_questions WHERE question_id=?";
		SubjectQuestions question = (SubjectQuestions) jdbcTemplate.queryForObject(query, new Object[] { id },
				new SubjectQuestionsMapper());
		return question;
	}

	// Find all Questions of from a specific Subject
	@Override
	public List<SubjectQuestions> findAllBySubject(Integer id) {
		System.out.println("findAllBySubject inside :: " + this.getClass().getName());

		String query = "SELECT * FROM subjects_questions WHERE subject_id=" + id;

		List<SubjectQuestions> result = new ArrayList<SubjectQuestions>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);
		for (Map row : rows) {
			SubjectQuestions question = new SubjectQuestions();
			question.setQuestion_id((Integer) row.get("question_id"));
			question.setSubject_id((Integer) row.get("subject_id"));
			question.setQuestion((String) row.get("question"));
			question.setAnswer((String) row.get("answer"));
			question.setRed_herring_one((String) row.get("red_herring_one"));
			question.setRed_herring_two((String) row.get("red_herring_two"));
			question.setRed_herring_three((String) row.get("red_herring_three"));
			question.setRed_herring_four((String) row.get("red_herring_four"));
			question.setRed_herring_five((String) row.get("red_herring_five"));
			question.setRed_herring_six((String) row.get("red_herring_six"));

			result.add(question);
		}
		return result;
	}
}
