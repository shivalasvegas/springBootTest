package com.qa.calculatorsb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Calculator")
public class CalculatorController {
	
	@Autowired
	MyCalculator myCalc;
	
	// @RequestMapping(value="maths/{opp}/{a}/{b}", method=RequestMethod.GET)
	@GetMapping("/{opp}/{a}/{b}")
	public double calculation(@PathVariable(value="opp") String opp, @PathVariable(value="a") int a, @PathVariable(value="b") int b){ 
		
		if (opp.equals("add")) {
			return myCalc.add(a, b);
		}else if (opp.equals("subtract")) {
			return myCalc.subtract(a, b);
		}else if (opp.equals("multiply")) {
			return myCalc.multiply(a, b);
		}else return myCalc.divide(a,  b);
	
	}

}
