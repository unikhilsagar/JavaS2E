package Week6;

//reference chapter 2 import statements 
import java.util.Scanner;
import java.time.LocalDate;

//reference chapter 7 how to define classes
class Profile {
	
	//reference for chapter 13
	private String name;
	private String email;
	

	Scanner sc = new Scanner(System.in);
	//declaring arrays
	private final String[] cities = {"Alton", "Bloomington-Normal", "Champaign-Urbana", "Chicago",  "Effingham"};
	
	/*
	 * this method is invoked when user select 'Book a ticket'
	 * 
	 * */
	public void bookATicket() {
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter email");
		email = sc.next();
		
		String from, to;
		
		//select from station
		System.out.println("");
		System.out.println("Select From station");
		displayCities();
		from = cities[sc.nextInt()-1];
		
		//select to station
		System.out.println("");
		System.out.println("Select To station");
		displayCities();
		to = cities[sc.nextInt()-1];
		
		/*
		 * reference from chapter 11 how to work with strings
		 * reference from chapter 4 control statements
		 * */
		if(from.equals(to)) {
			System.out.println("from station and to station should be different");
		} else {
			proceedWithBooking(from,to);
		}
		
	}
	
	/*
	 * this method is used proceeding with booking
	 * 
	 * */
	public void proceedWithBooking(String fromStation,String toStation) {
		System.out.println("Do you want carry a pet : $ 5 will be charged extra. (Y/N)");
		char chPet = sc.next().toLowerCase().charAt(0);
		System.out.println("Do you want to carry a bicycle.: $ 10 will be charged extra. (Y/N)");
		char chCycle = sc.next().toLowerCase().charAt(0);
		

		proceedWithPayment(fromStation,toStation,chPet,chCycle);
			
	}
	
	/*
	 * this method is used proceeding with payment
	 * it will show details for amenities which availed 
	 * */
	public void proceedWithPayment(String fromStation,String toStation, char chPet, char chCycle) {
		
		//reference for chapter 3 primitive data type
		double ticketFare = 30.00;
		System.out.println("Ticket fare $ : 30.00");
		System.out.println("From station : " + fromStation + "\n To Station : " + toStation);
		
		
		//reference for chapter 3 primitive data type
		if(chPet =='y') {
			ticketFare = ticketFare + 5.00;
			System.out.println("Pet fare $ : 5.00");
		}
		
		
		//reference for chapter 3 primitive data type
		if(chCycle =='y') {
			ticketFare = ticketFare + 10.00;
			System.out.println("bicycle fare $ : 10.00");
		}
		
		
		System.out.println("Total fare : $ " + ticketFare);
		System.out.println("Do you want to proceed with payment? (Y/N)");
		//reference for chapter 3 primitive data type
		char chPy = sc.next().toLowerCase().charAt(0);
		if(chPy == 'y') {
			generateTicket(fromStation,toStation);
		}
		
	}
	
	
	/*
	 * this method is used generate ticket
	 * reference for chapter 5 code methods
	 * */
	public void generateTicket(String fromStation,String toStation) {
		
		//reference for chapter 14 Times and date
		LocalDate currentDate = LocalDate.now();
		
		System.out.println("Hi ");
		System.out.println("Ticket Details ");
		System.out.println("Name : " + getProfileName());
		System.out.println("From Station : " + fromStation);
		System.out.println("To Station : " + toStation);
		
		//reference for chapter 14 Times and date
		System.out.println("Date of Journey:" + currentDate.getMonthValue() + " - " + currentDate.getDayOfMonth() + " - " + currentDate.getYear());
		System.out.println("Ticket is also sent to your mail " + getProfileEmail());
		System.out.println("We wish you a happy journey");
	}
	
	/*
	 * this method is used printing station cities names
	 * */
	public void displayCities() {
		for(int i = 0;i<cities.length;i++) {
			System.out.println((i+1) + ". " + cities[i]);
		}
		System.out.println("");
	}
	
	public String getProfileName() {
		return name;
	}
	
	public String getProfileEmail() {
		return email;
	}
	
}
public class AmTrackTicketBooking {

		//reference for chapter 2 first java application
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//reference for chapter 2 printing console
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Amtrak Ticket System");
		
        Profile profile = new Profile();
 
        
		
		boolean book = true;
		 //control structures references for chapter 4
		 do {
			 System.out.println("");
			 System.out.println("Select Menu");
	         System.out.println("1. Book A Ticket");
	         System.out.println("2. View Stations");
	         System.out.println("3. Exit");
	         System.out.println("");
	         
	         System.out.print("Enter your choice: ");
	         
	       //reference for chapter 3 primitive data type
	         int choice = scanner.nextInt();
	       //control structures references for chapter 4
			switch (choice) {
	        case 1:
	        	//reference chapter 7 call method from a object
	        	profile.bookATicket();
	        	book = false;
	            break;
	        
	        case 2:
	        	profile.displayCities();
	        	break;
	        case 3:
	        	book = false;
	        default:
	            System.out.println("Invalid choice, Please select a correct choice .");
	            break;
			}
		 } while(book);

	}

}
