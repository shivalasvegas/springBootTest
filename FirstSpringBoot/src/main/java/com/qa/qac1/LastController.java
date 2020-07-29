package com.qa.qac1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Last")  // will recognise Last in localhost:8003/Last/
public class LastController {
	
	// shorter way of GET request
	@GetMapping
	public String message() {
		return "Last recieved the GET request";
	}

}
