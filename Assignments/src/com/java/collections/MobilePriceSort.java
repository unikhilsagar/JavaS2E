package com.java.collections;

import java.util.Comparator;

public class MobilePriceSort implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		// TODO Auto-generated method stub
		return ((Double)o1.getPrice()).compareTo(o2.getPrice());
	}

	

}
