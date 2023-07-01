package com.prowings.inheritance_singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BIKE")
@DiscriminatorValue("BIKE")

public class Bike extends Vehicle {
	@Column(name="NOOFWHEELS")
	int noofwheels;


	public int getNoofwheels() {
		return noofwheels;
	}

	public void setNoofwheels(int noofwheels) {
		this.noofwheels = noofwheels;
	}
	
	@Override
	public String toString() {
		return "Bike [noofwheels=" + noofwheels + ", id=" + id + ", name=" + name + "]";
	}

	
	
	

}
