package com.example.dingo.fitness.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dingo.fitness.models.User;
import com.example.dingo.fitness.services.UserService;



@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired
	private com.example.dingo.fitness.services.UserService userService;
	
	@PostMapping("/signup")
	public User create(@RequestBody User user) {
		return userService.add(user);
	}
}