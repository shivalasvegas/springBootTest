package com.qa.qaconsulting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.qa.qaconsulting.entity.Student;
import com.qa.qaconsulting.repository.StudentRepository;

@RestController
public class MyController {
	
	@Autowired
	StudentRepository stuRepo;
	
//	@GetMapping("/save")
//	public String saveRecord() {
//		
//		Student ref = new Student();
//		ref.setStudentId(34);
//		ref.setStudentName("Shan");
//		ref.setStudentAddress("Colchester");
//		stuRepo.save(ref);
//		return "Record saved";
//	}
	
	@GetMapping("/save/{studentId}/{name}/{address}")
	public String save(@PathVariable(value="studentId") int id, 
			@PathVariable(value="name") String name, 
			@PathVariable(value="address") String address) {
		
		Student ref2 = new Student();
		ref2.setStudentId(id);
		ref2.setStudentName(name);
		ref2.setStudentAddress(address);
		stuRepo.save(ref2);
		return "The record for " + ref2.getStudentName() + " is now saved!";
		
		
	}

}
