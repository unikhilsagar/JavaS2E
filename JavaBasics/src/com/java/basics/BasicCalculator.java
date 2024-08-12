package com.java.basics;

public class BasicCalculator implements Icalculator{

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x+y);
	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x*y);
	}

	

}
