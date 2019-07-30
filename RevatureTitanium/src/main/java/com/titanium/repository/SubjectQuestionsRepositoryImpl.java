package com.titanium.repository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.titanium.configuration.JdbcConfig;
import com.titanium.models.SubjectQuestions;

@Repository
public class SubjectQuestionsRepositoryImpl implements SubjectQuestionsRepository {

	@Autowired
	private DataSource dataSource = new JdbcConfig().dataSource();
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

	@PostConstruct
	private void postConstruct() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

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
