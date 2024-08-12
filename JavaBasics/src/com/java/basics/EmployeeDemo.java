package com.java.basics;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Manager("Ravi","Software","70,000",8);
		employee.printDetails();
		employee.showMenu();
		employee.calcBonus(300);
		
		Manager manager = (Manager)employee;
		String[] hobbies = {"cricket","novel"};
		
		manager.printDetails();
		manager.showMenu();
	
		manager.calcBonus(400);
		manager.showHobbies(hobbies);
		
		Developer developer = (Developer)employee;
		
		developer = new Developer("sai","software","50,000","senior");
		developer.printDetails();
		developer.showMenu();
		developer.inDoor();
		developer.outDoor();
		developer.calcBonus(400);
		developer.showSkills();
		
	}

}
