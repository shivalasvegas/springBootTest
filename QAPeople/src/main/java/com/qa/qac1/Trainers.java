package com.qa.qac1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trainers {
	
	@RequestMapping(value="trainer/shafeeq")
	public String TShafeeq() {
		return "Shafeeq the trainer";
	}

	
	@RequestMapping(value="consultant/shafeeq")
	public String CShafeeq() {
		return "Shafeeq the consultant";
	}
}
