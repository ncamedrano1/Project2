package com.titanium.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.titanium.aspect.LoggingAspect;
import com.titanium.configuration.JdbcConfig;
import com.titanium.models.SubjectQuestions;
import com.titanium.models.SubjectQuestionsMapper;

@Repository
public class SubjectQuestionsRepositoryImpl implements SubjectQuestionsRepository {

	private DataSource dataSource = new JdbcConfig().dataSource();
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	private LoggingAspect la = new LoggingAspect();

	@PostConstruct
	private void postConstruct() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// Find all Questions
	@Override
	public List<SubjectQuestions> findAll() {
		la.callLog(this);
		System.out.println("findAll inside :: " + this.getClass().getName());

		String query = "SELECT * FROM subjects_questions";
		List<SubjectQuestions> result = jdbcTemplate.query(query,
				(rs, rowNum) -> new SubjectQuestions(rs.getInt("question_id"), rs.getInt("subject_id"),
						rs.getString("question"), rs.getString("answer"), rs.getString("red_herring_one"),
						rs.getString("red_herring_two"), rs.getString("red_herring_three"),
						rs.getString("red_herring_four"), rs.getString("red_herring_five"),
						rs.getString("red_herring_six")));
		return result;
	}

	// Find a single question from a specific subject
	public SubjectQuestions findQuestionById(Integer id) {
		la.callLog(this);
		String query = "SELECT * FROM subjects_questions WHERE question_id=?";
		SubjectQuestions question = (SubjectQuestions) jdbcTemplate.queryForObject(query, new Object[] { id },
				new SubjectQuestionsMapper());
		return question;
	}

	// Find all Questions of from a specific Subject
	@Override
	public List<SubjectQuestions> findAllBySubject(Integer id) {
		la.callLog(this);
		System.out.println("findAllBySubject inside :: " + this.getClass().getName());

		String query = "SELECT * FROM subjects_questions WHERE subject_id=" + id;

		List<SubjectQuestions> result = jdbcTemplate.query(query,
				(rs, rowNum) -> new SubjectQuestions(rs.getInt("question_id"), rs.getInt("subject_id"),
						rs.getString("question"), rs.getString("answer"), rs.getString("red_herring_one"),
						rs.getString("red_herring_two"), rs.getString("red_herring_three"),
						rs.getString("red_herring_four"), rs.getString("red_herring_five"),
						rs.getString("red_herring_six")));
		return result;
	}
}
