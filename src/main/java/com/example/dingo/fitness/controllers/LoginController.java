package com.example.dingo.fitness.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dingo.fitness.models.AuthenticationResponse;
import com.example.dingo.fitness.models.User;
import com.example.dingo.fitness.security.MyUserDetailsService;
import com.example.dingo.fitness.util.JwtUtil;



@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	
	@Autowired
	private JwtUtil jwtTokenUtil;
	
	@RequestMapping(value ="/login", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthentificationToken(@RequestBody User user) throws Exception {
	
	try {//chnconnectiwlou w nasn3ou token ,generer un token
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
		
	}catch (BadCredentialsException e) {
		throw new Exception("Incorrect username or password", e);
	}
	
	final UserDetails userDetails = userDetailsService.loadUserByUsername(user.getEmail());
	final String token = jwtTokenUtil.generateToken(userDetails);
	
	return ResponseEntity.ok(new AuthenticationResponse(token, user.getEmail(), userDetails.getAuthorities()));
	}
}
