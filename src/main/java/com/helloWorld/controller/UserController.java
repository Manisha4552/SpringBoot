package com.helloWorld.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.helloWorld.controller.entity.UserEntities;
import com.helloWorld.services.UserServices;

@RestController
public class UserController {
	
	@Autowired
	private UserServices userService;
	
	@GetMapping("/users")
	public List<UserEntities> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/users")
	public UserEntities createUser(@RequestBody UserEntities userEntities) {
		return userService.createUser(userEntities);
	}
	
	@GetMapping("/users/{id}")
	public Optional<UserEntities> getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	
	@PutMapping("/users/{id}")
	public UserEntities updateUserById(@PathVariable Long id,@RequestBody UserEntities userEntities) {
		return userService.updateUserBId(id, userEntities);
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable Long id) {
		userService.deleteByUserId(id);
		return "Deleted Successfully";
	}
	
	@GetMapping("/users/byUserName/{userName}")
	public UserEntities getUserByUserName(@PathVariable String userName) {
		return userService.getUserByUserName(userName);
	}
	

}
