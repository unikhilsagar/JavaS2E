package com.java.interfaces;

public class Basic implements BasicCalculator{

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Add = " + (x+y));
	}

	@Override
	public void difference(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("difference = " + (x-y));
	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("product = " + (x*y));
	}

	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("divide = " + (x/y));
	}

}
