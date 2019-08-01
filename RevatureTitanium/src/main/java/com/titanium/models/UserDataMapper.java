package com.titanium.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserDataMapper implements RowMapper<Object> {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserData data = new UserData();
		data.setUser_id(rs.getInt("user_id"));
		data.setUsername(rs.getString("username"));
		data.setPassword(rs.getInt("user_password"));
		data.setFirstName(rs.getString("first_name"));
		data.setLastName(rs.getString("last_name"));
		data.setEmail(rs.getString("user_email"));
		data.setUser_role_id(rs.getInt("user_role_id"));
		return data;
	}

}
