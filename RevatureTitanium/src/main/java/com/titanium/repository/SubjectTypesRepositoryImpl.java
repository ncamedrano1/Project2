package com.titanium.repository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.titanium.configuration.JdbcConfig;
import com.titanium.models.SubjectTypes;

@Repository
public class SubjectTypesRepositoryImpl implements SubjectTypesRepository {

	@Autowired
	private DataSource dataSource = new JdbcConfig().dataSource();
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

	@PostConstruct
	private void postConstruct() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<SubjectTypes> findAll() {
		System.out.println("findAll inside :: " + this.getClass().getName());

		String query = "SELECT * FROM subject_types";

		List<SubjectTypes> result = jdbcTemplate.query(query,
				(rs, rowNum) -> new SubjectTypes(rs.getInt(1), rs.getString(2)));
		return result;

	}
}
