package com.titanium.services;

import com.titanium.aspect.LoggingAspect;
import com.titanium.models.UserData;
import com.titanium.repository.UserDataRepository;
import com.titanium.repository.UserDataRepositoryImpl;

public class UserManipulationServiceImpl implements UserManipulationService {
	LoggingAspect la = new LoggingAspect();

	@Override
	public Boolean registerUser(String username, String password, String firstName, String lastName) {
		la.callLog(this);
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
