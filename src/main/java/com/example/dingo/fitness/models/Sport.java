package com.example.dingo.fitness.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Sport {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SPORT_ID")
	 private Long id;
	 private String name;
	 private float price;
	 private String description;
	 @OneToMany
		private List<Coach>coaches;
	 @ManyToOne
		private User user;
	public Sport() {
		
	}

	public Sport(String name, float price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Sport [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	 
 
 
}
