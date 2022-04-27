package com.example.dingo.fitness.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dingo.fitness.models.Coach;
import com.example.dingo.fitness.services.CoachService;


@CrossOrigin("http://localhost:4200")  //(*) ken nheb na3tih acces front al kol 
@RestController
@RequestMapping("api/coaches")
public class CoachController {
	@Autowired
	private com.example.dingo.fitness.services.CoachService coachService;
	
	@PostMapping("/addCoach")
	public Coach create(@RequestBody Coach coach) {
		return coachService.add(coach);
	}

}
