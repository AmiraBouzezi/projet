package com.example.dingo.fitness.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.dingo.fitness.models.Sport;
import com.example.dingo.fitness.repositories.SportRepository;
import com.example.dingo.fitness.services.SportServices;


@Service
public class SportserviceImpl implements SportServices{
	@Autowired
    private SportRepository sportRepository; 
	private static final Logger LG=Logger.getLogger(Sport.class);//cest une instance pas une var simple 
	@Override
	public List<Sport> getAllSports() {
		LG.info("Fetching all sports");
		return sportRepository.findAll() ;
		
	}

	@Override
	public Sport updateSport(Sport sport) {
		LG.info("Updating new sport {} to the database");
		return sportRepository.save(sport);
	}

	@Override
	public void deleteSport(Long id) {
		LG.info("deleting sport ");
		sportRepository.deleteById(id);
		
	}

	@Override
	public Sport addSport(Sport sport) {
		LG.info("Adding sport{} to the DB  ");
		return sportRepository.save(sport);
	}

	@Override
	public Sport findSportById(Long id) {//predef kol teb3in jpa repo
		Optional<Sport> sport = sportRepository.findById(id);  //true ou false
		 return sport.isPresent() ? sport.get() : null;

	}
}
