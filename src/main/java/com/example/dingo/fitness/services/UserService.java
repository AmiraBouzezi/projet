package com.example.dingo.fitness.services;

import com.example.dingo.fitness.models.User;

public interface UserService {
	
	public User add(User user);
	
	public User getUserByEmailAndPassword(String email, String password);


}
