package com.qa.qaconsulting.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id // primary key
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	//getters and setters
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	

}
