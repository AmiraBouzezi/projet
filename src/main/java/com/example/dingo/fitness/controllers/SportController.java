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

import com.example.dingo.fitness.models.Sport;
import com.example.dingo.fitness.services.SportServices;



@CrossOrigin("http://localhost:4200")  //(*) ken nheb na3tih acces front al kol 
@RestController
@RequestMapping("api/sports")
public class SportController {

	@Autowired
	private SportServices sportService;
	@GetMapping("")
	public List<Sport> getAllSports(){
		return sportService.getAllSports();
	}
	@PutMapping("/{id}")
	public Sport updateSport(@RequestBody Sport sport) {//@PathVariable Long id ,ma nestha9hech hne
		return sportService.updateSport(sport);
	}
	@DeleteMapping("/{id}")
	public void deleteSport(@PathVariable Long id) {
		sportService.deleteSport(id);
	}
	@PostMapping
	public Sport addSport(@RequestBody Sport sport) {
		return sportService.addSport(sport);
	}
	@GetMapping("/{id}")
	public Sport getSportById(@PathVariable Long id) {
		return sportService.findSportById(id);
	}
}



