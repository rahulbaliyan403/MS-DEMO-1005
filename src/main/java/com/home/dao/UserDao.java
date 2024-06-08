package com.home.dao;

import java.util.List;

import com.home.dto.UserDto;
import com.home.entity.UserEntity;

public interface UserDao {

	UserEntity saveUser(UserDto user);

	List<UserEntity> getUsers();

}
