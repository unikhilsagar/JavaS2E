package com.java.basics;

public class Developer extends Employee implements Games {
	
	String designation;

	/**
	 * @param empName
	 * @param department
	 * @param salary
	 * @param designation
	 */
	public Developer(String empName, String department, String salary, String designation) {
		super(empName, department, salary);
		this.designation = designation;
	}

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Menu");
				System.out.println("1.Coffee");
				
				System.out.println("2.Maggi");
				System.out.println("3.Sandwich");
				System.out.println("4.Ice Cream");
	}

	@Override
	public void outDoor() {
		// TODO Auto-generated method stub
		System.out.println("1.cricket");
		System.out.println("2.Foot Ball");
	}

	@Override
	public void inDoor() {
		// TODO Auto-generated method stub
		System.out.println("1.caroom Board");
		System.out.println("2.Chess");
	}

	@Override
	void calcBonus(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Bonus amount =  "+ amount);
	}
	
	String [] showSkills() {
		return new String[] {"Java","Javascript","HTML","CSS"};
	}

}
