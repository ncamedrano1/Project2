package com.titanium.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SubjectTypesMapper implements RowMapper<Object> {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		SubjectTypes subject = new SubjectTypes();
		subject.setSubject_type_id(rs.getInt("subject_type_id"));
		subject.setSubject_type(rs.getString("subject_type"));
		return subject;
	}
}
