package com.project.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dao.UserDao;
import com.project.service.domain.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	SqlSession sqlSession;
	
	public UserDaoImpl(){
		System.out.println(">> User Dao Create");
	}
	
	public List<User> getUsers() {
		return sqlSession.selectList("getUsers");
	}

}
