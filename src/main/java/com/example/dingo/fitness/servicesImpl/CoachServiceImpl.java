package com.example.dingo.fitness.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.dingo.fitness.models.Coach;
import com.example.dingo.fitness.repositories.CoachRepository;
import com.example.dingo.fitness.services.CoachService;

@Service
public class CoachServiceImpl implements CoachService{
	@Autowired
	private CoachRepository coachRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public Coach add(Coach coach) {
		String password = coach.getPassword();
    	coach.setPassword(bCryptPasswordEncoder.encode(password));
		return coachRepository.save(coach);
	}

	@Override
	public Coach getCoachByEmailAndPassword(String email, String password) {
		return coachRepository.findCoachByEmailAndPassword(email, password);
	}

}
