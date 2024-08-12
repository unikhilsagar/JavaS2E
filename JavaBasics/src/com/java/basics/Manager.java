package com.java.basics;

public class Manager extends Employee implements  Cafeteria{
	
	int experience; 
	
	/**
	 * @param empName
	 * @param department
	 * @param salary
	 * @param experience
	 */
	public Manager(String empName, String department, String salary, int experience) {
		super(empName, department, salary);
		this.experience = experience;
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
	void calcBonus(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Bonus amount =  "+ amount);
	}

	
	public void showHobbies(String[] hobbies) {
		for(String hobby:hobbies) {
			System.out.println(hobby);
		}
	}



	


}
