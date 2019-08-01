package com.titanium.services;

public interface UserQueryService {

	Boolean checkUsernameExists(String username);

	Boolean confirmCredentials(String username, String password);

}