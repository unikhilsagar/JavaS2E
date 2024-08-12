package com.java.collections;

import java.util.Comparator;

public class MobileBrandSort implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		// TODO Auto-generated method stub
		return o1.getBrand().compareTo(o2.getBrand());
	}

	

}
