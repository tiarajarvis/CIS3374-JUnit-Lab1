package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	
	@Test
	public void addTest(){
		assertEquals(4, calculator.add(2,2));
		
	}
	
	@Test
	public void subtractTest(){
		assertTrue(0 == calculator.subtract(2,2));
	}
	
	@Test
	public void multiplyTest(){
		assertTrue(8 == calculator.multiply(4,2));
	}
	
	@Test
	public void divideTest(){
		assertFalse(9 == calculator.divide(2,4));
	}
}
