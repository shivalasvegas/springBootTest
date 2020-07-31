package com.qa.applicationdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.applicationdemo.entity.Sale;
import com.qa.applicationdemo.services.SalesService;
@CrossOrigin
@RestController
public class MyController {

	SalesService service;
	
	public MyController(SalesService service) {
		this.service = service;
	}
	
//	@PostMapping("/create")
//	public String createRecord(@RequestBody Sale saleItem) {
//	String message = service.create(saleItem);
//
//	return message;
//}
//	
	// Read one record
	@GetMapping("/readspecific/{salesId}")
	public Optional<Sale> readOneRecord(@PathVariable(value="salesId") int id) {
		Optional<Sale> record = service.readSpecific(id);
		
		return record;	
	}
	
	// Read all record
		@GetMapping("/readall")
		public List<Sale> readAllRecords() {
			List<Sale> record = service.readAll();
			
			return record;	
		}
	
	// Delete
	@DeleteMapping("/delete/{salesId}")
	public String deleteRecord(@PathVariable(value="salesId") int id) {
		String message = service.delete(id);
		return message;
	}
	
}
