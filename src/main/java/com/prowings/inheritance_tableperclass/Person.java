package com.prowings.inheritance_tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
@Table(name="PERSON")

public class Person {
	
	@Id
	@Column(name="PERSON_ID")
	int id;
	
	@Column(name="PERSON_NAME")
	String name;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name) {
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
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	

}
