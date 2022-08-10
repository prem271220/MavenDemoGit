package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class CalculatorTests {
	
	Calculator c = new Calculator();
	int res;
	
	@BeforeAll
	public static void checkBeforeAll() {
		
		System.out.println("before all");
	}
	
	@BeforeEach
	public void checkBeforeEach() {
		res=0;
		System.out.println("before each");
	}
	
	
	@Test
	public void testsubNos() {
		res =c.subNos(300,200);
		Assertions.assertEquals(100, res,"check the subNos method");
	}
	
	
	//@Disabled
	@Test
	public void checkNull() {
		String s1=null;
		String s2="hello";
	Assertions.assertNull(s1);
	Assertions.assertNotNull(s2);
	}
	
	@AfterEach
	public void checkAfterEach() {
		System.out.println("After each");
	}
	
	@AfterAll
	public static void checkAfterAll() {
		
		System.out.println("After all");
	}

}
