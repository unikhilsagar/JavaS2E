package Week6;

import java.util.Scanner;

public class AssignmentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your grade");
		
		double percentage = scanner.nextDouble();
		
		if(percentage>=90 && percentage < 100) {
			System.out.println("Grade A");
		} else if(percentage>=80 && percentage < 90) {
			System.out.println("Grade B");
		} else if(percentage>=70 && percentage < 80) {
			System.out.println("Grade C");
		} else if(percentage>=60 && percentage < 70) {
			System.out.println("Grade D");
		}

		
		
		
	}

}
