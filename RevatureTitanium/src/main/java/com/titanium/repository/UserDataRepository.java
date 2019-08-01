package com.titanium.repository;

import java.util.List;

import com.titanium.models.UserData;

public interface UserDataRepository {

	List<UserData> findAll();

	List<UserData> findAllByRole(Integer id);

	UserData findUser(Integer id);

	UserData findUser(String username);

	UserData findUser(String firstName, String lastName);

	Boolean insertUser(UserData user);

}