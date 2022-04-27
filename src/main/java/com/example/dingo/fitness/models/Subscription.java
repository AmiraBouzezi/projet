package com.example.dingo.fitness.models;

import javax.persistence.Entity;
import javax.persistence.Id;



	@Entity
	public class Subscription {
		
		@Id
		private int id;

		private float fee;
		private String description;
		private String duration;
		public float getFee() {
			return fee;
		}
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public void setFee(float fee) {
			this.fee = fee;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public Subscription(float fee, String description, String duration) {
			super();
			this.fee = fee;
			this.description = description;
			this.duration = duration;
		}
	}

