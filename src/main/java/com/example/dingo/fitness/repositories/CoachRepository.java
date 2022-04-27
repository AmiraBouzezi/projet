package com.example.dingo.fitness.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dingo.fitness.models.Coach;



@Repository
public interface CoachRepository extends JpaRepository<Coach, Integer>{
 Coach findCoachByEmailAndPassword(String email, String password);
	
	Coach findCoachByEmail(String email);

}
