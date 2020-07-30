package com.qa.applicationdemo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.qa.applicationdemo.entity.Sale;
import com.qa.applicationdemo.repository.SalesRepo;

@Service
public class SalesService {
	
	
	@Autowired 
	SalesRepo salesRepo;
	
//	public void storeRecord() {
//		
//		Sale saleItem = new Sale();
//		saleItem.setProductName("Coke");
//		saleItem.setQuantity(12);
//		salesRepo.save(saleItem);
//	}
	
//Create
	public String createRecord(@RequestBody Sale saleItem) {
		salesRepo.save(saleItem);
		
		return "Record made";
	}
	
	//Read

	public Optional<Sale> readSpecific(int id) {
		
		//Optional<Student> opt = stuRepo.findById(id);
		if (salesRepo.existsById(id)) {
			Optional<Sale> ref = salesRepo.findById(id);
			return ref;
			
		}
		return null;
	}
	
	//Update
	
	
	//delete
	public String deleteRecord(int id) {
		String message;	
		Optional<Sale> record = salesRepo.findById(id);
		
		if (record.isPresent()) {
			salesRepo.deleteById(id);
			message =  "Record deleted";
		}else message = "Id does not exsit";
		return message;
}
	
	
}
