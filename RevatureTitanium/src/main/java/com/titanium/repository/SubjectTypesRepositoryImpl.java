package com.titanium.repository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.titanium.aspect.LoggingAspect;
import com.titanium.configuration.JdbcConfig;
import com.titanium.models.SubjectTypes;
import com.titanium.models.SubjectTypesMapper;

@Repository
public class SubjectTypesRepositoryImpl implements SubjectTypesRepository {

	private DataSource dataSource = new JdbcConfig().dataSource();
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	private LoggingAspect la = new LoggingAspect();

	@PostConstruct
	private void postConstruct() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<SubjectTypes> findAll() {
		la.callLog(this);
		System.out.println("findAll inside :: " + this.getClass().getName());

		String query = "SELECT * FROM subject_types";
		List<SubjectTypes> result = jdbcTemplate.query(query,
				(rs, rowNum) -> new SubjectTypes(rs.getInt(1), rs.getString(2)));
		return result;
	}

	public SubjectTypes findOneSubjectById(Integer id) {
		la.callLog(this);
		String query = "SELECT * FROM subject_types WHERE subject_type_id=?";
		SubjectTypes subject = (SubjectTypes) jdbcTemplate.queryForObject(query, new Object[] { id },
				new SubjectTypesMapper());
		return subject;
	}

	// This will return a single String of the Subject Type, based on the ID given
	public String findSubjectNameById(Integer id) {
		la.callLog(this);
		String query = "SELECT subject_type FROM subject_types WHERE subject_type_id=?";
		String subjectName = (String) jdbcTemplate.queryForObject(query, new Object[] { id }, String.class);
		return subjectName;
	}

	public Integer findSubjectIdByName(String subject) {
		la.callLog(this);
		String query = "SELECT subject_type_id FROM subject_types WHERE LOWER(subject_type)=?";
		Integer subjectId = Integer
				.parseInt(jdbcTemplate.queryForObject(query, new Object[] { subject.toLowerCase() }, String.class));
		return subjectId;
	}
}
