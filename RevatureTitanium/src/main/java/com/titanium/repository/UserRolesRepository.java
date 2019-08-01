package com.titanium.repository;

import java.util.List;

import com.titanium.models.UserRoles;

public interface UserRolesRepository {

	List<UserRoles> findAll();

	String findUserRoleById(Integer id);

	Integer findIdByUserRole(String role);

}