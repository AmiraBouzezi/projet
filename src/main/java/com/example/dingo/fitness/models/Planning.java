package com.example.dingo.fitness.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Planning {
	@Id
	private int id;
	String pseudo;
	@ManyToOne
	private Sport sport;
	public String getPseudo() {
		return pseudo;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport sport) {
		this.sport = sport;
	}
	public Planning(String pseudo, Sport sport) {
		super();
		this.pseudo = pseudo;
		this.sport = sport;
	}
	
	

}

