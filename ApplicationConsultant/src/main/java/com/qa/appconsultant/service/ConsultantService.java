package com.qa.appconsultant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.appconsultant.model.Consultant;
import com.qa.appconsultant.repository.ConsultantRepo;


@Service
public class ConsultantService {

	@Autowired
	ConsultantRepo conRepo;
	
	//Create		
	public String create(Consultant consultant) {
		conRepo.save(consultant);
	
		return "Record created";
	}
	
	public List<String> clients(){
		return conRepo.clients();
	}
	  
	public List<String> technologies(){
		return conRepo.technologies();
	}
	
	public List<String> consultants(){
		return conRepo.consultants();
	}
	
	public int maxSalary() {
		return conRepo.maxSalary();
	}
	
	public int maxSalaryClient(String client) {
		return conRepo.maxSalaryClient(client);
	}
	
	public int numberTechConsultants(String client, String tech) {
		return conRepo.numberTechConsultants(client, tech);
	}
	
	
}
