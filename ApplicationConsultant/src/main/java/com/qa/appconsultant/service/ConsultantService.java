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
	
	public List<Consultant> findByClient(){
		return conRepo.findByClient();
		
	}
	
	public List<Consultant> findByTechnology(){
		return conRepo.findByTechnology();
	}
	
	public List<Consultant> findByConsultant(){
		return conRepo.findByConsultant();
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
	
	public List<String> clients(){
		return conRepo.clients();
	}
	  
}
