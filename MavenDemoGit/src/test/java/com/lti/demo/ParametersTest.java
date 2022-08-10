package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametersTest {
	
	@ParameterizedTest
	@ValueSource(ints= {2,4,6,8,10}) //ints not int
	public void TestAryParam(int arg) {
		System.out.println(arg);
		Assertions.assertTrue(arg%2==0);
	}

	@DisplayName("Shouldv pass test case")
	@ParameterizedTest
	@ValueSource(strings= {"hello","hii"})
	public void testParam(String msg) {
		Assertions.assertNotNull(msg);
	}
	
	@Test
	public void testLambda() {
		Integer[] intAry= {10,20,5,25};
		List<Integer> intList = Arrays.asList(intAry);
		
		Assertions.assertAll(
				()->assertEquals(10,intList.get(0)),
				()->assertEquals(20,intList.get(1)),
				()->assertEquals(5,intList.get(2)),
				()->assertEquals(25,intList.get(3)),
				()->assertNull(null)
				);
		}
	
	@RepeatedTest(value=3,name="Repeat 3 times")
	public void repeatTest() {
		int a=10,b=20;
		Assertions.assertEquals(200,a*b);
	}
		
}
