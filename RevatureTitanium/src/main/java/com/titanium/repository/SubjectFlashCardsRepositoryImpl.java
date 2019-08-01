package com.titanium.repository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.titanium.configuration.JdbcConfig;
import com.titanium.models.SubjectFlashCards;
import com.titanium.models.SubjectFlashCardsMapper;

public class SubjectFlashCardsRepositoryImpl implements SubjectFlashCardsRepository {

	private DataSource dataSource = new JdbcConfig().dataSource();
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

	@PostConstruct
	private void postConstruct() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// Find all FlashCards
	@Override
	public List<SubjectFlashCards> findAll() {
		System.out.println("findAll inside :: " + this.getClass().getName());

		String query = "SELECT * FROM subjects_questions";

		List<SubjectFlashCards> result = jdbcTemplate.query(query,
				(rs, rowNum) -> new SubjectFlashCards(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4)));
		return result;
	}

	// Find a single FlashCard from a specific subject
	@Override
	public SubjectFlashCards findFlashCardById(Integer id) {
		String query = "SELECT * FROM subject_questions WHERE question_id=?";
		SubjectFlashCards question = (SubjectFlashCards) jdbcTemplate.queryForObject(query, new Object[] { id },
				new SubjectFlashCardsMapper());
		return question;
	}

	// Find all FlashCards of from a specific Subject
	@Override
	public List<SubjectFlashCards> findAllBySubject(Integer id) {
		System.out.println("findAllBySubject inside :: " + this.getClass().getName());
		String query = "SELECT * FROM subjects_questions WHERE subject_id=" + id;
		List<SubjectFlashCards> result = jdbcTemplate.query(query,
				(rs, rowNum) -> new SubjectFlashCards(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4)));
		return result;
	}
}
