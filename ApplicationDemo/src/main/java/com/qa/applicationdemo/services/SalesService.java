package com.qa.applicationdemo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.applicationdemo.entity.Sale;
import com.qa.applicationdemo.repository.SalesRepo;

@Service
public class SalesService {
	
	
	@Autowired 
	SalesRepo salesRepo;
	
	public void storeRecord() {
		
		Sale saleItem = new Sale();
		saleItem.setProductName("Coke");
		saleItem.setQuantity(12);
		salesRepo.save(saleItem);
	}
	
	public String deleteRecord(int a) {
		String message;	
		Optional<Sale> record = salesRepo.findById(a);
		
		if (record.isPresent()) {
			salesRepo.deleteById(a);
			message =  "Record deleted";
		}else message = "Id does not exsit";
		return message;
}
}
