package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UserDao;
import com.project.service.UserService;
import com.project.service.domain.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	
	public UserServiceImpl() {
		System.out.println(">> UserService Default Constructor");
	}
	
	@Override
	public List<User> getUsers() {
		return userDao.getUsers();
	}
	
}
