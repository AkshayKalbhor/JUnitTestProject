package me.kalbhor.akshay.JUnitTestProject;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	Calculator calc;
	
	protected void setUp() throws Exception {
		calc = new Calculator();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * 
	 */
	public void testAdder() {
		int result = calc.adder(1, 4);
		assertEquals(5, result);
	}

	public void testMultiplier() {
		int result = calc.multiplier(1, 4);
		assertEquals(4, result);
	}

	public void testSubtractor() {
		int result = calc.subtractor(4, 1);
		assertEquals(3, result);
	}

}
