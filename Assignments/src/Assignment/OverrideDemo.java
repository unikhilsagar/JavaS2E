package Assignment;

import java.util.Scanner;

public class OverrideDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter designation M/P");
		String desig = sc.next();

		Employee employee;
		if (desig.equalsIgnoreCase("M")) {
			employee = new Manager();
			employee.calcBonus(1000);
		} else if (desig.equalsIgnoreCase("P")) {
			employee = new Programmer();
			employee.calcBonus(1000);
		} else {
			employee = new Employee();
			employee.calcBonus(1000);
		}

	}

}
