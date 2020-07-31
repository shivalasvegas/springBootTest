package com.qa.appconsultant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.qa.appconsultant.model.Consultant;
import com.qa.appconsultant.service.ConsultantService;

@RestController
public class ControllerCon {

	@Autowired
	ConsultantService service;
	
	@GetMapping("/client")
	public List<Consultant> findByClient(){
		return service.findByClient();
		
	}
	
	@GetMapping("/technology")
	public List<Consultant> findByTechnology(){
		return service.findByTechnology();
	}
	
	@GetMapping("/Consultant")
	public List<Consultant> findByConsultant(){
		return service.findByConsultant();
	}
	
	
	@GetMapping("/maxsalary")
	public int maxSalary() {
		return service.maxSalary();
	}
	
	@GetMapping("/maxsalaryclient/{client}")
	public int maxSalaryClient(@PathVariable(value="client") String client) {
		return service.maxSalaryClient(client);
	}
	
	@GetMapping("/numbertechconsultants/{client}/{tech}")
	public int numberTechConsultants(@PathVariable("client") String client, @PathVariable("tech") String tech) {
		return service.numberTechConsultants(client, tech);
	}
	
	
}
