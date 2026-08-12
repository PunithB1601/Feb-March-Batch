package com.dcl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.User;
import com.dcl.repo.UserRepo;
import com.dcl.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo urepo;
	
	@Autowired
	private EmailService eservice;
	
	@Override
	public User addUser(User user) {
		User u=urepo.save(user);
		eservice.sendMail(u.getUsername(), u.getEmail());
		return u;
	}

	@Override
	public void updateUser(User user) {
		urepo.save(user);
	}

	@Override
	public void deleteUser(Integer userId) {
		urepo.deleteById(userId);
	}

	@Override
	public User getUserById(Integer userId) {
		return urepo.findById(userId).orElse(null);
	}

	@Override
	public List<User> getAllUser() {
		return urepo.findAll();
	}

}
