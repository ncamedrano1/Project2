package com.titanium.repository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.titanium.configuration.JdbcConfig;
import com.titanium.models.UserData;
import com.titanium.models.UserRoles;

@Repository
public class UserRolesRepositoryImpl implements UserRolesRepository {
	private DataSource dataSource = new JdbcConfig().dataSource();
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

	@PostConstruct
	private void postConstruct() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<UserRoles> findAll() {
		String query = "SELECT * FROM users_roles";
		List<UserRoles> result = jdbcTemplate.query(query,
				(rs, rowNum) -> new UserRoles(rs.getInt("users_role_id"), rs.getString("users_role")));
		return result;
	}

	@Override
	public String findUserRoleById(Integer id) {
		String query = "SELECT users_role FROM users_roles WHERE users_role_id=?";
		String role = (String) jdbcTemplate.queryForObject(query, new Object[] { id }, String.class);
		return role;
	}

	@Override
	public Integer findIdByUserRole(String role) {
		String query = "SELECT users_role_id FROM users_roles WHERE LOWER(users_role)=?";
		Integer roleId = Integer
				.parseInt(jdbcTemplate.queryForObject(query, new Object[] { role.toLowerCase() }, String.class));
		return roleId;
	}
}
