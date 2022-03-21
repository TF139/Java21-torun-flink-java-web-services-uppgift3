package com.example.demo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CalculatorControllerTest {

	private calculatorController sut;
	@Before
	public void test() {
		sut = new calculatorController();
	}
	
	@Test 
	public void testAdd() throws IOException{
		Double actual = sut.add(6.0, 3.0);
		Double expected = 9.0;
		Double notExpected = 8.0;
		
		assertEquals(expected, actual);
		assertNotEquals(notExpected, actual);
	}
	
	@Test 
	public void testMinus() throws IOException{
		Double actual = sut.minus(6.0, 3.0);
		Double expected = 3.0;
		Double notExpected = 8.0;
		
		assertEquals(expected, actual);
		assertNotEquals(notExpected, actual);
	}
	
	@Test 
	public void testDiv() throws IOException{
		Double actual = sut.div(6.0, 3.0);
		Double expected = 2.0;
		Double notExpected = 8.0;
		
		assertEquals(expected, actual);
		assertNotEquals(notExpected, actual);
	}
	
	@Test 
	public void testMulti() throws IOException{
		Double actual = sut.multi(6.0, 3.0);
		Double expected = 18.0;
		Double notExpected = 8.0;
		
		assertEquals(expected, actual);
		assertNotEquals(notExpected, actual);
	}
	
}