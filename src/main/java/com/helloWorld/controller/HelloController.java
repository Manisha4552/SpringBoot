package com.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helloWorld.controller.entity.UserDetails;

@RestController
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping("helloWorld")
	public String printHelloWorld() {
		return "Hello Manisha!!!!";
	}
	
	@GetMapping("helloWorldBean")
	public UserDetails printHelloBean() {
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName("Manisha");
		userDetails.setLastName("Deo");
		userDetails.setCity("Gunupur");
		
		return userDetails;
		
	}

}
