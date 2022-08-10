package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class TestBeforeAfter {

	Calculator c = new Calculator();

	@Test
	public void testSayHello() {
		
		Assertions.assertEquals("hello",c.sayHello());
	}
	
	@Test
	public void testAddNos() {
		int res =c.addNos(100,200);
		Assertions.assertEquals(300, res);
	}

}
