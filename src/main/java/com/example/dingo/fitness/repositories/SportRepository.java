package com.example.dingo.fitness.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dingo.fitness.models.Sport;
@Repository
public interface SportRepository extends JpaRepository<Sport, Long> {
	
}