package com.example.dingo.fitness.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.dingo.fitness.models.User;
import com.example.dingo.fitness.repositories.UserRepository;
import com.example.dingo.fitness.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public User add(User user) {
		String password = user.getPassword();
    	user.setPassword(bCryptPasswordEncoder.encode(password));
		return userRepository.save(user);
	}

	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		return userRepository.findUserByEmailAndPassword(email, password);
	}
	
	

}
