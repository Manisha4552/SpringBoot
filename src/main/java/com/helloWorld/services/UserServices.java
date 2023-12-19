package com.helloWorld.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloWorld.controller.entity.UserEntities;
import com.helloWorld.repositories.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository userRepository;
	
	public List<UserEntities> getAllUsers(){
		return userRepository.findAll();
	}
	
	public UserEntities createUser(UserEntities userEntities) {
		return userRepository.save(userEntities);
		
	}
	
	public Optional<UserEntities> getUserById(Long id) {
		Optional<UserEntities> user = userRepository.findById(id);
		return user;
	}
	
	public UserEntities updateUserBId(Long id, UserEntities user) {
		user.setUserId(id);
		return userRepository.save(user);
	}
	
	public void deleteByUserId(Long id) {
		if(userRepository.findById(id).isPresent()) {
			userRepository.deleteById(id);
		}
	}
	
	public UserEntities getUserByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}
}
