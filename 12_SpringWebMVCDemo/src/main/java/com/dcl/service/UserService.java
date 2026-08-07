package com.dcl.service;

import java.util.List;

import com.dcl.entity.User;

public interface UserService {

	User addUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(Integer userId);
	
	User getUserById(Integer userId);
	
	List<User> getAllUser();
	
	
}
