package Assignment;

public class Programmer extends Employee{

	@Override
	void calcBonus(int a) {
		System.out.println("Bonus of pgr "+a*3);
	}

}
