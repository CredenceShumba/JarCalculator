package com.nttdata.main;

import com.nttdata.credcalculator.service.Calculator;
import com.nttdata.credcalculator.service.CredCalculator;

/**
 * @author SHUMBC
 *
 */
public class Application {

	public static void main(String[] args) {
		// use a referenced library from the classpath
		CredCalculator cal = new Calculator();

		//add two values using the referenced library
		System.out.println("Addition: " + cal.add(5, 5));
		//subtract two values using the referenced library
		System.out.println("Subtraction: " + cal.subtract(10, 4));
		//multiply two values using the referenced library
		System.out.println("Multiplication: " + cal.multiply(5, 2));
		//divide two values using the referenced library
		System.out.println("Division: " + cal.divide(10, 2));
		// execution of this line is an error as it returns a zero answer than not
		// returning nothing
		System.err.println("I don't want to return anything when an exception has been encountered, "
				+ "terminate or exit the method called without return \"" + cal.divide(10, 0) + "\"");
	}
}
