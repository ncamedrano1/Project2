package com.titanium.repository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.titanium.aspect.LoggingAspect;
import com.titanium.configuration.JdbcConfig;
import com.titanium.models.UserData;
import com.titanium.models.UserDataMapper;

@Repository
public class UserDataRepositoryImpl implements UserDataRepository {

	private DataSource dataSource = new JdbcConfig().dataSource();
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	private LoggingAspect la = new LoggingAspect();

	@PostConstruct
	private void postConstruct() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<UserData> findAll() {
		la.callLog(this);
		String query = "SELECT * FROM users_data";
		List<UserData> result = jdbcTemplate.query(query,
				(rs, rowNum) -> new UserData(rs.getInt("user_id"), rs.getString("username"), rs.getInt("user_password"),
						rs.getString("first_name"), rs.getString("last_name"), rs.getString("user_email"),
						rs.getInt("user_role_id")));
		return result;
	}

	@Override
	public UserData findUser(Integer id) {
		la.callLog(this);
		String query = "SELECT * FROM users_data WHERE user_id=?";
		UserData data = (UserData) jdbcTemplate.queryForObject(query, new Object[] { id }, new UserDataMapper());
		return data;
	}

	@Override
	public UserData findUser(String username) {
		la.callLog(this);
		String query = "SELECT * FROM users_data WHERE LOWER(username)=?";
		UserData data = (UserData) jdbcTemplate.queryForObject(query, new Object[] { username }, new UserDataMapper());
		return data;
	}

	@Override
	public UserData findUser(String firstName, String lastName) {
		la.callLog(this);
		String query = "SELECT * FROM users_data WHERE LOWER(first_name)=? AND LOWER(last_name)=?";
		UserData data = (UserData) jdbcTemplate.queryForObject(query, new Object[] { firstName, lastName },
				new UserDataMapper());
		return data;
	}

	@Override
	public List<UserData> findAllByRole(Integer id) {
		la.callLog(this);
		String query = "SELECT * FROM users_data WHERE user_role_id=" + id;
		List<UserData> result = jdbcTemplate.query(query,
				(rs, rowNum) -> new UserData(rs.getInt("user_id"), rs.getString("username"), rs.getInt("user_password"),
						rs.getString("first_name"), rs.getString("last_name"), rs.getString("user_email"),
						rs.getInt("user_role_id")));
		return result;
	}

	@Override
	public Boolean insertUser(UserData user) {
		la.callLog(this);
		String username = user.getUsername();
		Integer pass = user.getPassword();
		String first = user.getFirstName();
		String last = user.getLastName();
		String email = user.getEmail();
		String query = "INSERT INTO users_data (user_id, username, user_password, first_name, last_name, user_email, user_role_id), VALUES(null,"
				+ username + "," + pass + "," + first + "," + last + "," + email + ",2)";
		jdbcTemplate.update(query);
		return false;
	}
}
