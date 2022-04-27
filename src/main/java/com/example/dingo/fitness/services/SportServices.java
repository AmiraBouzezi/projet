package com.example.dingo.fitness.services;

import java.util.List;

import com.example.dingo.fitness.models.Sport;




public interface SportServices {

	public List<Sport> getAllSports();
	public Sport updateSport(Sport sport);  //mel base
	public void deleteSport(Long id);
	public Sport addSport(Sport sport); //"Sport" add.. loula chyrj3 l id ,el sghuira ma fihech id 5tr famech chkoun da5el fiha
	public Sport findSportById(Long id);
	
	

}

	
	

