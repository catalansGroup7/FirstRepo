package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Arithmetic;

public class TestArith {
	private Arithmetic arith;
	
	@Before
	public void init() {
		arith = new Arithmetic();
	}
	
	@Test
	public void testDub() {
		assertEquals(10, arith.sub(20, 10));
	}
}
