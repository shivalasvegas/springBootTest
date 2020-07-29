package com.qa.calculatorsb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Finance")
public class FinanceController {
	
	@Autowired
	Finance taxedSalary;
	
	@RequestMapping(value="/finance/tax/{salary}", method=RequestMethod.GET)
	public String taxSalary(@PathVariable("salary") int salary) {
		return "Your taxed salary is: " + taxedSalary.tax(salary);
	}

	@GetMapping("/message")
	public String message1() {
		return "GET request recieved";
	}
	
	@PostMapping("/message")
	public String message2() {
		return "POST request recieved";
	}
	
	@DeleteMapping("/message")
	public String message3() {
		return "DELETE request recieved";
	}
	
	
}
