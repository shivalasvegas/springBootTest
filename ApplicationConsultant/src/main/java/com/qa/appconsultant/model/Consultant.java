package com.qa.appconsultant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Consultant {

	@Id
	@GeneratedValue
	@Column(name="consultant_id")
	private int consultantId;
	@Column(length=50, name="consultant_name")
	private String consultantName;
	@Column(length=50)
	private String client;
	@Column(length=50)
	private String technology;
	private int salary;
	private int marks;
	
	
	public int getConsultantId() {
		return consultantId;
	}
	public void setConsultantId(int consultantId) {
		this.consultantId = consultantId;
	}
	public String getConsultantName() {
		return consultantName;
	}
	public void setConsultantName(String consultant) {
		this.consultantName = consultant;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
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
