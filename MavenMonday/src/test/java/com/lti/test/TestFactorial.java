package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Factorial;

public class TestFactorial {
	
	private Factorial fact;
	
	@Before
	public void init() {
		fact = new Factorial();
	}
	
	@Test
	public void testgetFactorial() {
		
		assertEquals(120, fact.getFactorial(5));
	}
}
