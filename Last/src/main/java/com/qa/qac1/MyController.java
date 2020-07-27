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
	
	
	@RequestMapping(value="maths/{opp}/{a}/{b}", method=RequestMethod.GET)
	public double calculation(@PathVariable(value="opp") String opp, @PathVariable(value="a") int a, @PathVariable(value="b") int b){ 
		MyCalculator myCalc = new MyCalculator();
		if (opp.equals("add")) {
			return myCalc.add(a, b);
		}else if (opp.equals("subtract")) {
			return myCalc.subtract(a, b);
		}else if (opp.equals("multiply")) {
			return myCalc.multiply(a, b);
		}else return myCalc.divide(a,  b);
	
	}
}
