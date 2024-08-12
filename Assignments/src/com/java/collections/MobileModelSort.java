package com.java.collections;

import java.util.Comparator;

public class MobileModelSort implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		// TODO Auto-generated method stub
		return o1.getModel().compareTo(o2.getModel());
	}

}
