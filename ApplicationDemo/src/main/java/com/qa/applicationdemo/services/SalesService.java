package com.qa.applicationdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.applicationdemo.entity.Sale;
import com.qa.applicationdemo.repository.SalesRepo;

@Service
public class SalesService {

	@Autowired
	SalesRepo salesRepo;

	//Create		
	public String create(Sale saleItem) {
		salesRepo.save(saleItem);
	
		return "Record created";
	}
	
	
	//Read
	public Optional<Sale> readSpecific(int id) {

		if (salesRepo.existsById(id)) {
			Optional<Sale> ref = salesRepo.findById(id);
			return ref;

		}
		return null;
	}

	// findAll() returns a List<> type, so should be saved as a list of type Student
	// And this returned.

	//	@GetMapping("/readall")
	public List<Sale> readAll() {
		List<Sale> records = salesRepo.findAll();

		return records;

	}

	// Update

	// delete
	public String delete(int id) {
		String message;
		Optional<Sale> record = salesRepo.findById(id);

		if (record.isPresent()) {
			salesRepo.deleteById(id);
			message = "Record deleted";
		} else
			message = "Id does not exsit";
		return message;
	}

}
