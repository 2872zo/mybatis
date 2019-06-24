package com.project.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.project.service.domain.User;

@Mapper
public interface UserMapper {
	@Select("SELECT * FROM users")
	public List<User> getUsers();
	
}
