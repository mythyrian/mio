package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@Table( name = "ACTOR")
public class Actor {
	
	@Id
	private short actor_id;
	
	private String first_name;
	private String last_name;
	
	public Actor() {
		
	}
	
	public Actor(String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public short getActor_id() {
		return actor_id;
	}

	public void setActor_id(short actor_id) {
		this.actor_id = actor_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	
	
	

}
