package com.lti.demos;

public class Hi {
	
	public static void main(String[] args) {
		try {
			int a=1,b=2;
			a =a/(b-2);
		}
		catch(ArithmeticException ae) {
			System.out.println("in catch");
		}
		finally {
			System.out.println("in finally");
		}
	}
	

}
