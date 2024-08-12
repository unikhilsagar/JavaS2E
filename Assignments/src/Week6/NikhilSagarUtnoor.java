package Week6;
import java.util.Scanner;

public class NikhilSagarUtnoor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("TEC 5373 Lab 3");
				
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter a name");
				
		System.out.println("");
		String name = sc.nextLine();
		String[] fullNameArray = name.split(" ");
				
		System.out.println("My first name is : " + fullNameArray[0]);
		System.out.println("My middle initial is : " + fullNameArray[1]);
		System.out.println("My first name is : " + fullNameArray[2]);

	}

}
