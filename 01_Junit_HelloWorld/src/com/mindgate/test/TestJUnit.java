package com.mindgate.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJUnit {

	@Test
	public void testAdd() {
		String message = "Hello World JUnit";
		assertEquals("Hello World Junit", message);
	}
}
