package com.titanium.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.titanium.services.UserManipulationService;
import com.titanium.services.UserManipulationServiceImpl;
import com.titanium.services.UserQueryService;
import com.titanium.services.UserQueryServiceImpl;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/users")
public class UserController {
	private UserManipulationService ums = new UserManipulationServiceImpl();
	private UserQueryService uqs = new UserQueryServiceImpl();

	@RequestMapping("/login")
	public @ResponseBody Boolean loginUser(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		return uqs.confirmCredentials(username, password);
	}

	@RequestMapping("/register")
	public @ResponseBody Boolean registerUser(@RequestParam("username") String username,
			@RequestParam("password") String pass, @RequestParam("firstName") String first,
			@RequestParam("lastName") String last) {
		ums.registerUser(username, pass, first, last);
		return true;
	}
}
