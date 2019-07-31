package com.titanium.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SubjectQuestionsMapper implements RowMapper<Object> {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		SubjectQuestions questions = new SubjectQuestions();
		questions.setQuestion_id(rs.getInt("question_id"));
		questions.setSubject_id(rs.getInt("subject_id"));
		questions.setQuestion(rs.getString("question"));
		questions.setAnswer(rs.getString("answer"));
		questions.setRed_herring_one(rs.getString("red_herring_one"));
		questions.setRed_herring_two(rs.getString("red_herring_two"));
		questions.setRed_herring_three(rs.getString("red_herring_three"));
		questions.setRed_herring_four(rs.getString("red_herring_four"));
		questions.setRed_herring_five(rs.getString("red_herring_five"));
		questions.setRed_herring_six(rs.getString("red_herring_six"));
		return questions;
	}
}
