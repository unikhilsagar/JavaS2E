package com.java.interfaces;

public class MainCalculator {
	public static void main(String[] args) {
		Scientific science = new Scientific();
		science.add(2, 3);
		science.difference(9, 3);
		science.product(3, 9);
		science.divide(100,20);
		science.sqaure(9);
		science.cube(9);
	}
}
