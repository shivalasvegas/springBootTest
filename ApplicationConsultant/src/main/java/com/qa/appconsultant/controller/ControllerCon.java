package com.qa.appconsultant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.appconsultant.model.Consultant;
import com.qa.appconsultant.service.ConsultantService;

@RestController
public class ControllerCon {

	@Autowired
	ConsultantService service;

	@PostMapping("/create")
	public String createRecord(@RequestBody Consultant consultant) {
		String message = service.create(consultant);

		return message;
	}

	@GetMapping("/client")
	public List<String> clients() {
		return service.clients();

	}

	@GetMapping("/technology")
	public List<String> technologies() {
		return service.technologies();
	}

	@GetMapping("/consultant")
	public List<String> consultants() {
		return service.consultants();
	}

	@GetMapping("/maxsalary")
	public int maxSalary() {
		return service.maxSalary();
	}

	@GetMapping("/maxsalaryclient/{client}")
	public int maxSalaryClient(@PathVariable(value = "client") String client) {
		return service.maxSalaryClient(client);
	}

	@GetMapping("/numbertechconsultants/{client}/{tech}")
	public int numberTechConsultants(@PathVariable("client") String client, @PathVariable("tech") String tech) {
		return service.numberTechConsultants(client, tech);
	}

}
