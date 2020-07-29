package com.qa.calculatorsb;

import org.springframework.stereotype.Component;

@Component
public class MyCalculator {

	
	public double add(int num1, int num2) {
		return Double.valueOf(num1) + Double.valueOf(num2);
	}
	
	public double subtract(int num1, int num2) {
		return Double.valueOf(num1) - Double.valueOf(num2);
	}
	
	public double multiply(int num1, int num2) {
		return Double.valueOf(num1) * Double.valueOf(num2);
	}
	
	public double divide(int num1, int num2) {
		return Double.valueOf(num1) / Double.valueOf(num2);
	}

}
