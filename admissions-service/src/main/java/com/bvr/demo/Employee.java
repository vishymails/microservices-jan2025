package com.bvr.demo;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	private String id;
	private String firstName;
	private String lastName;
	private String speciality;
	
	
	public Employee(String id, String firstName, String lastName, String speciality) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.speciality = speciality;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	

}
