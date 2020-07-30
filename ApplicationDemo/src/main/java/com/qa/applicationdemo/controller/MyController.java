package com.qa.applicationdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.applicationdemo.services.SalesService;

@RestController
public class MyController {

	SalesService service;
	public MyController(SalesService service) {
		this.service = service;
	}
	
	@PostMapping("/create")
	public String insertRecord(@RequestBody SalesService service) {
	service.save(service);

	return "record made";
}
	
	
//	/	@GetMapping("/readall")
//	public List<Student> showAllRecords() {
//		List<Student> records = stuRepo.findAll();
//		
//		return records;
//		
//	}
	
	
	
	@GetMapping("/delete/{id}")
	public String deleteRecord(@PathVariable("salesId") int id) {
		String message = service.deleteRecord(id);
		return message;
	}
	
}
