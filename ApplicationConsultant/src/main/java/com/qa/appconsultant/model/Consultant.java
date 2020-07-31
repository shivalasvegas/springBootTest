package com.qa.appconsultant.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Consultant {

	@Id
	@GeneratedValue
	private int consultantId;
	private String name;
	private String address;
	private String client;
	private int salary;
	private int marks;
	
	public int getConsultantId() {
		return consultantId;
	}
	public void setConsultantId(int consultantId) {
		this.consultantId = consultantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
	
}
