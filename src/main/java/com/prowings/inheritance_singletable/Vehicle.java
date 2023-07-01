package com.prowings.inheritance_singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="VEHICLE_TYPE",discriminatorType = DiscriminatorType.STRING)

public class Vehicle {
	
	
	@Id
	int id;
	
	@Column(name="NAME")
	String name;
	
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Vehicle(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
