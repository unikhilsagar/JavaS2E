package com.java.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MobileMain {
	public static void main(String[] args) {
		List<Mobile> list = Arrays.asList(new Mobile("Samsung", "s3", 90000), new Mobile("Apple", "Iphone 15", 70000),
				new Mobile("Apple", "Iphone 9", 40000), new Mobile("Nokie", "", 50000),
				new Mobile("Samsung", "s3", 30000), new Mobile("Samsung", "s3", 10000));

		System.out.println("sort with Comparator model");
		Collections.sort(list, new MobileModelSort());
		for (Mobile mobile : list)
			System.out.println(mobile);

		System.out.println("sort with Comparator brand");
		Collections.sort(list, new MobileBrandSort());
		for (Mobile mobile : list)
			System.out.println(mobile);
		
		System.out.println("sort with Comparator price");
		Collections.sort(list, new MobilePriceSort());
		for (Mobile mobile : list)
			System.out.println(mobile);

		//Now with lamda 
		
		System.out.println("sort with Comparator model lamda");
		Collections.sort(list, (o1,o2)->o1.getModel().compareTo(o2.getModel()));
		for (Mobile mobile : list)
			System.out.println(mobile);

		System.out.println("sort with Comparator brand lamda");
		Collections.sort(list, (o1,o2)->o1.getBrand().compareTo(o2.getBrand()));
		for (Mobile mobile : list)
			System.out.println(mobile);
		
		System.out.println("sort with Comparator price lamda");
		Collections.sort(list, (o1,o2)->((Double)o1.getPrice()).compareTo(o2.getPrice()));
		for (Mobile mobile : list)
			System.out.println(mobile);
		
		
	}
}
