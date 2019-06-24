package com.project.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.UserService;
import com.project.service.domain.User;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}
}
