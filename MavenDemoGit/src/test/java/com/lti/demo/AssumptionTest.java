package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionTest {

	@Test
    void testOnDev()
    {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), AssumptionTest::message);
        System.out.println(" pgm continue execution");
    }

    @Test
    void testOnProd()
    {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("PROD".equals(System.getProperty("ENV")),AssumptionTest::message);
        System.out.println(" don't continue execution");
    }

    private static String message () {
        return "TEST Execution Failed :: ";
    }
	

}
