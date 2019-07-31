package com.titanium.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SubjectFlashCardsMapper implements RowMapper<Object> {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		SubjectFlashCards flashCard = new SubjectFlashCards();
		flashCard.setQuestion_id(rs.getInt("question_id"));
		flashCard.setSubject_id(rs.getInt("subject_id"));
		flashCard.setQuestion(rs.getString("question"));
		flashCard.setAnswer(rs.getString("answer"));
		return flashCard;
	}

}
