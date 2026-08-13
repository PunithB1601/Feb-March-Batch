package com.dcl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.dto.UserDto;
import com.dcl.entity.User;
import com.dcl.repo.UserRepository;
import com.dcl.request.RegisterRequest;
import com.dcl.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository urepo;
	
	@Override
	public UserDto register(RegisterRequest request) {
		
		//validating whether the user is existing user or not!
		
		User alreadyExists=urepo.findByEmail(request.getEmail()).orElse(null);
		if(alreadyExists!=null) {
			throw new RuntimeException("User already exists!");
		}
		
		//
		//transfering the data from request to entity
		User user=new User();
		user.setName(request.getName());
		user.setPhone(request.getPhone());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		user=urepo.save(user);
		
		//tranfering the data from entity to dto
		UserDto dto=new UserDto();
		dto.setUserId(user.getUserId());
		dto.setName(user.getName());
		dto.setPhone(user.getPhone());
		dto.setEmail(user.getEmail());
		dto.setCreatedAt(user.getCreatedAt());
		
		return dto;
	}

}
