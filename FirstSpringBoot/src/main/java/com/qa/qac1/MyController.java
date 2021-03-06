package com.qa.qac1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		
		//select *
		return "Welcome to my home page! ... GET";
	}
	
	@RequestMapping(value="/reply/{name}", method=RequestMethod.GET)
	public String reply(@PathVariable(value="name") String name) {
		
		return "Hello " + name;
	}
	
	@RequestMapping(value="/info/{name}/{address}", method=RequestMethod.GET)
	public String info(@PathVariable(value="name") String name, @PathVariable(value="address") String address) {
		return "Hello " + name + " living in " +  address;
	}
	
	
	@RequestMapping(value="/aboutus", method=RequestMethod.POST)
	public String aboutUS() {
		
		// insert *
		return "We do stuff! ... POST";
	}
	
	@RequestMapping(value="/trainers", method=RequestMethod.DELETE)
	public String trainers() {
		
		//delete *
		return "WE train people! ... DELETE";
	}
	
	
}
