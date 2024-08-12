package com.java.basics;

public class EmpCalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBonusCal cal = new EmpDetails();
		cal.calcInterest(2000);
		cal.paymentTaxex();
		
		ILoanCalculator iloan = (ILoanCalculator) cal;
		iloan.calcInterest(9000);
		iloan.paymentTaxex();
		
		IBonusCal.showDetails();
		System.out.println(IBonusCal.ALLOWANCE);
		System.out.println(IBonusCal.MESSAGE);
	}

}
