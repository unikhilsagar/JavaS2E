package com.java.basics;

public abstract class Employee implements Cafeteria {
	String empName,department,salary;

	/**
	 * @param empName
	 * @param department
	 * @param salary
	 */
	public Employee(String empName, String department, String salary) {
		super();
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}
	
	void printDetails() {
		System.out.println(" Employee Name is " + empName + " working in a department + " + department + " with salary " + salary);
	}
	
	abstract void calcBonus(int amount);

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Menu");
		System.out.println("1.Coffee");
		
		System.out.println("2.Maggi");
		System.out.println("3.Sandwich");
		System.out.println("4.Ice Cream");
		
		
	}
	
	
		
	
}
