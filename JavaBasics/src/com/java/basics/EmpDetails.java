package com.java.basics;

public class EmpDetails implements IBonusCal, ILoanCalculator {

	@Override
	public void calcInterest(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Interest " + amount);
	}

	@Override
	public void paymentTaxex() {
		// TODO Auto-generated method stub
		System.out.println("In employee details");
		System.out.println("3 months");
		ILoanCalculator.super.paymentTaxex();
		IBonusCal.super.paymentTaxex();
	}
	

	

}
