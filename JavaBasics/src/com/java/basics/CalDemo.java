package com.java.basics;

public class CalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icalculator Ical = new ScientificCal();
		Ical.add(4, 10);
		Ical.product(4, 10);
		
		IScientific iScientific = new ScientificCal();
	     iScientific.square(5);
	     iScientific.cube(5);
	}

}
