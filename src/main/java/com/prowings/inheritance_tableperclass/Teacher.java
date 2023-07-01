package com.prowings.inheritance_tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TEACHER")

public class Teacher extends Person {
	
	
	@Column(name="YEAROFEXPERINCE")
	int yearofExperince;
	
	
	@Column(name="SALLARY")
	int sallary;
	
	
	public int getYearofExperince() {
		return yearofExperince;
	}
	public void setYearofExperince(int yearofExperince) {
		this.yearofExperince = yearofExperince;
	}
	public int getSallary() {
		return sallary;
	}
	public void setSallary(int sallary) {
		this.sallary = sallary;
	}
	@Override
	public String toString() {
		return "Teacher [yearofExperince=" + yearofExperince + ", sallary=" + sallary + ", id=" + id + ", name=" + name
				+ "]";
	}
	
	

}
