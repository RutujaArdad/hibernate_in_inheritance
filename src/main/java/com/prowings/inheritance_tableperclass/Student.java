package com.prowings.inheritance_tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")

public class Student extends Person {
	
	@Column(name="FEE")
	int fee;
	
	@Column(name="GREADE")
	String greade;
	
	
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getGreade() {
		return greade;
	}
	public void setGreade(String greade) {
		this.greade = greade;
	}
	@Override
	public String toString() {
		return "Student [fee=" + fee + ", greade=" + greade + ", id=" + id + ", name=" + name + "]";
	}
	
	
	

}
