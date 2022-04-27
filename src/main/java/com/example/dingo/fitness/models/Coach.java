package com.example.dingo.fitness.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Coach {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COACH_ID")  
	private Long id;
	private String name;
	private int age;
	private String speciality;
	private int experience;
	private String email;
	private String password;
	@ManyToOne
	private Sport sport;
	
	
	
	
	public Coach() {
		
	}
	
	public Coach(String name, int age, String speciality, int experience) {
		super();
		this.name = name;
		this.age = age;
		this.speciality = speciality;
		this.experience = experience;
	}
	

	public String getMail() {
		return email;
	}

	public void setMail(String mail) {
		this.email = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", age=" + age + ", speciality=" + speciality + ", experience="
				+ experience + "]";
	}
	
	
	
	

}
