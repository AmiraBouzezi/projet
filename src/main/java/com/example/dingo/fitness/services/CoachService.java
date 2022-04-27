package com.example.dingo.fitness.services;

import com.example.dingo.fitness.models.Coach;
import com.example.dingo.fitness.models.User;

public interface CoachService {
    public Coach add(Coach coach);
	
	public Coach getCoachByEmailAndPassword(String email, String password);

}
