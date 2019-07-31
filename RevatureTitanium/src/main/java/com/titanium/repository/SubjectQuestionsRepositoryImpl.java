package com.titanium.repository;

import java.util.List;

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

		List<SubjectQuestions> result = jdbcTemplate.query(query,
				(rs, rowNum) -> new SubjectQuestions(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getString(10)));
		return result;
	}

	// Find a single question from a specific subject
	public SubjectQuestions findQuestionById(Integer id) {
		String query = "SELECT * FROM subject_questions WHERE question_id=?";
		SubjectQuestions question = (SubjectQuestions) jdbcTemplate.queryForObject(query, new Object[] { id },
				new SubjectQuestionsMapper());
		return question;
	}

	// Find all Questions of from a specific Subject
	@Override
	public List<SubjectQuestions> findAllBySubject(Integer id) {
		System.out.println("findAllBySubject inside :: " + this.getClass().getName());

		String query = "SELECT * FROM subjects_questions WHERE subject_id=" + id;

		List<SubjectQuestions> result = jdbcTemplate.query(query,
				(rs, rowNum) -> new SubjectQuestions(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getString(10)));
		return result;
	}
}
