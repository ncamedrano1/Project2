package com.revature.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.models.SubjectTypes;

@Repository
public class SubjectTypesRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<SubjectTypes> findAll() {
		List<SubjectTypes> result = jdbcTemplate.query("SELECT * FROM subject_types",
				(rs, rowNum) -> new SubjectTypes(rs.getInt("subject_type_id"), rs.getString("subject_type")));
		return result;
	}
}
