package com.qa.qaconsulting.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.qaconsulting.entity.Student;
import com.qa.qaconsulting.repository.StudentRepository;


@RestController
public class MyController {
	
	@Autowired // injects stuRepo
	StudentRepository stuRepo;
	
	// first 
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
	
	//  findAll() returns a List<> type, so should be saved as a list of type Student
	// And this returned.
//	@GetMapping("/readall")
//	public List<Student> showAllRecords() {
//		List<Student> records = stuRepo.findAll();
//		
//		return records;
//		
//	}
	
//	@GetMapping("/save/{studentId}/{name}/{address}")
//	public String save(@PathVariable(value="studentId") int id, 
//			@PathVariable(value="name") String name, 
//			@PathVariable(value="address") String address) {
//		
//		Student ref2 = new Student();
//		ref2.setStudentId(id);
//		ref2.setStudentName(name);
//		ref2.setStudentAddress(address);
//		stuRepo.save(ref2);
//		return "The record for " + ref2.getStudentName() + " is now saved!";
//			
//	}
	
	@DeleteMapping("/delete/{studentId}")
	public String delete(@PathVariable(value="studentId") int id) {
		Student ref3 = new Student();
		ref3.setStudentId(id);
		stuRepo.deleteById(ref3.getStudentId());
		return "Deleted record with id: " + ref3.getStudentId();
	
	}
	
	@PostMapping("/insertrecord")
	public String insertRecord(@RequestBody Student student1) {
		stuRepo.save(student1);
		//return student1.getStudentId() + " " + student1.getStudentName() + " " +  student1.getStudentAddress();
		
		return "record made";
	}
	
	@GetMapping("/showrecord/{studentId}")
	public Student specificRecord(@PathVariable(value="studentId") int id) {
		
		Optional<Student> opt = stuRepo.findById(id);
		if (opt.isPresent()) {
			Student ref = opt.get();
			return ref;
			
		}
		return null;
	}
	
	
}
