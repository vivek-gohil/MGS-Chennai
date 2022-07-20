package com.mindgate.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mindgate.pojo.Message;

public class MessageTest {

	String message = "This is test message";
	Message messageObject = new Message(message);
	
	@Test
	public void testMessage() {
		String message = "Hello World";
		assertEquals(message, messageObject.getMessage());
	}
}
