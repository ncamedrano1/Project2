package com.titanium.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRolesMapper implements RowMapper<Object> {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserRoles ur = new UserRoles();
		ur.setUser_role_id(rs.getInt("users_role_id"));
		ur.setUser_role(rs.getString("users_role"));
		return ur;
	}

}
