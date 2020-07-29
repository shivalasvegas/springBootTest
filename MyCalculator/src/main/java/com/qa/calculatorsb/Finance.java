package com.qa.calculatorsb;

import org.springframework.stereotype.Component;

@Component
public class Finance {
	
	public double tax (int salary) {
		double taxed = Double.valueOf(salary)*20/100;
		return taxed;
							
	}

}
