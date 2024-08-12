package com.java.basics;

public interface IBonusCal {
	void calcInterest(double amount);
	
	String ALLOWANCE ="allowance";
	String MESSAGE ="allowance";
	
	
	default void paymentTaxex() {
		System.out.println("6 months");
	}
	
	static void showDetails() {
		System.out.println("Bonus calculator of emp");
	}
}
