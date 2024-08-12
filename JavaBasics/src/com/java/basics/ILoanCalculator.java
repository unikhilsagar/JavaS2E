package com.java.basics;

public interface ILoanCalculator {
	void calcInterest(double amount);
	default void paymentTaxex() {
		System.out.println("12 months");
	}
}
