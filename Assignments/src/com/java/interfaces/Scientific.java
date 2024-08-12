package com.java.interfaces;

public class Scientific extends Basic implements BasicCalculator,ScientificCalculator {

	@Override
	public void sqaure(int x) {
		// TODO Auto-generated method stub
		System.out.println("the square of " + x + " is " + Math.pow(x,2));
	}

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub
		System.out.println("the square of " + x + " is " + Math.pow(x,3));
	}

}
