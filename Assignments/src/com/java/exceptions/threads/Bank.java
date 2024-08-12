package com.java.exceptions.threads;

public class Bank {
	void withDraw(int amount) throws Exception {
		System.out.println("Inside Bank");
		try {			
			if(amount>2000) {
				throw new Exception("out of limits");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			System.out.println("close db");
		}
		System.out.println("work done");
	}
}
