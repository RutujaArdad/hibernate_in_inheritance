package com.prowings.inheritance_singletable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CAR")
public class Car extends Vehicle {
	
	@Column(name="NOOFWHEELS")
	int noofwheels;
	
	@Column(name="STEERINGTYPE")
	String steeringtype;
	
	
	public int getNoofwheels() {
		return noofwheels;
	}
	
	public void setNoofwheels(int noofwheels) {
		this.noofwheels = noofwheels;
	}
	
	public String getSteeringtype() {
		return steeringtype;
	}
	
	public void setSteeringtype(String steeringtype) {
		this.steeringtype = steeringtype;
	}
	
	@Override
	public String toString() {
		return "Car [noofwheels=" + noofwheels + ", steeringtype=" + steeringtype + ", id=" + id + ", name=" + name
				+ "]";
	}
	
	
	
	

}
