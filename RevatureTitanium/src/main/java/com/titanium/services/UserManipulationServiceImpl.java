package com.titanium.services;

import com.titanium.models.UserData;
import com.titanium.repository.UserDataRepository;
import com.titanium.repository.UserDataRepositoryImpl;

public class UserManipulationServiceImpl implements UserManipulationService {

	@Override
	public Boolean registerUser(String username, String password, String firstName, String lastName) {
		// check if username exists in DB
		UserQueryService uqs = new UserQueryServiceImpl();
		UserData user = new UserData();
		user.setUsername(username);
		user.setPassword(password.hashCode());
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail("test@test.com");
		if (uqs.checkUsernameExists(user.getUsername())) {

		} else {
			UserDataRepository udr = new UserDataRepositoryImpl();
			if (udr.insertUser(user)) {
				return true;
			}
		}
		return false;
	}
}
