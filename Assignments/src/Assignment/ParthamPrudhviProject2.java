package Assignment;

import java.util.Scanner;

public class ParthamPrudhviProject2 {

	private static final double TAX_RATE = 0.0475;
    private static final double[] LAPTOP_PRICES = {1950.89, 910.54, 1345.95, 506.00};
    private static final double[] EXTERNAL_DRIVE_PRICES = {50.55, 75.00, 119.99, 129.99};
    private static final String[] LAPTOP_BRANDS = {"Lenovo", "Dell", "HP", "Asus"};
    private static final String[] EXTERNAL_DRIVE_BRANDS = {"Startech", "Seagate", "Sandisk", "WD"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		String welcomeStore = "WelcometoSimplifiedComputer!";
		
		String welcomeStoreSpaces = welcomeStore.substring(0,7) + " " + welcomeStore.substring(7,9) + " " + welcomeStore.substring(9,19) + " " + welcomeStore.substring(19,28);
        System.out.println(welcomeStoreSpaces);

		String openStoreString = "We are open Monday to Thursday from 9 am to 6 pm.\n";

        System.out.println(openStoreString.replace("Thursday","Friday"));

        System.out.print("What day are you visiting the store? ");
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "monday":
			case "tuesday": 
			case "wednesday":
			case "thursday":
			case "friday": 
                System.out.println("You are welcomed to the store\n");
                displayItems(LAPTOP_BRANDS, LAPTOP_PRICES, "Laptops");
                displayItems(EXTERNAL_DRIVE_BRANDS, EXTERNAL_DRIVE_PRICES, "External Drives");
                break;
            case "saturday":
			case "sunday":
                System.out.println("Store is closed.");
                return;
            default :
                System.out.println("Invalid day.");
                return;
        }

        System.out.println("The most expensive laptop price is: $" + findMaxPrice(LAPTOP_PRICES));
        System.out.println("The least expensive laptop price is: $" + findMinPrice(LAPTOP_PRICES));
        System.out.println("The most expensive external drive price is: $" + findMaxPrice(EXTERNAL_DRIVE_PRICES));
        System.out.println("The least expensive external drive price is: $" + findMinPrice(EXTERNAL_DRIVE_PRICES));

        System.out.print("\nWhat laptop brand would you like? (Lenovo/Dell/HP/Asus) ");
        String laptopChoice = scanner.nextLine();
        double laptopCost = getPrice(laptopChoice, LAPTOP_BRANDS, LAPTOP_PRICES);

        if (laptopCost == -1) {
            System.out.println("Invalid laptop choice.");
            System.out.print("Do you want to get an external drive? (yes/no) ");
            String wantDrive = scanner.nextLine().toLowerCase();

            if (wantDrive.equals("yes")) {
                String driveChoice = selectItem(scanner, EXTERNAL_DRIVE_BRANDS);
                double driveCost = getPrice(driveChoice, EXTERNAL_DRIVE_BRANDS, EXTERNAL_DRIVE_PRICES);
                if (driveCost == -1) {
                    System.out.println("Invalid external drive choice. Total Price is $0.00");
                    return;
                }
                double totalCost = calculateTotalCost(0, driveCost);
                totalCost = applyDiscount(totalCost);
                System.out.println("The total Price is $" + String.format("%.2f", totalCost));
            } else {
                System.out.println("Total Price is $0.00");
            }
        } else {
            System.out.println("The price of the " + laptopChoice.toUpperCase() + " laptop is: $" + laptopCost);
            System.out.print("Would you like to get an external drive? (yes/no) ");
            String wantDrive = scanner.nextLine().toLowerCase();

            if (wantDrive.equals("yes")) {
                String driveChoice = selectItem(scanner, EXTERNAL_DRIVE_BRANDS);
                double driveCost = getPrice(driveChoice, EXTERNAL_DRIVE_BRANDS, EXTERNAL_DRIVE_PRICES);
                if (driveCost == -1) {
                    laptopCost = applyDiscount(laptopCost);
                    System.out.println("The total Price is $" + String.format("%.2f", laptopCost));
                    return;
                }
                double totalCost = calculateTotalCost(laptopCost, driveCost);
                totalCost = applyDiscount(totalCost);
                System.out.println("The total Price is $" + String.format("%.2f", totalCost));
            } else {
                double totalCost = calculateTotalCost(laptopCost, 0);
                totalCost = applyDiscount(totalCost);
                System.out.println("The total Price is $" + String.format("%.2f", totalCost));
            }
        }
    }

    private static void displayItems(String[] brands, double[] prices, String itemType) {
        System.out.println(itemType + ":");
        for (int i = 0; i < brands.length; i++) {
            System.out.println((i + 1) + ". " + brands[i] + " - $" + prices[i]);
        }
        System.out.println();
    }

    private static double getPrice(String choice, String[] brands, double[] prices) {
        for (int i = 0; i < brands.length; i++) {
            if (choice.equalsIgnoreCase(brands[i])) {
                return prices[i];
            }
        }
        return -1;
    }

    private static String selectItem(Scanner scanner, String[] items) {
        System.out.print("What brand would you like? (" + String.join("/", items) + ") ");
        return scanner.nextLine();
    }

    private static double findMaxPrice(double[] prices) {
        double maxPrice = prices[0];
        
		for(int i = 0; i<prices.length-1;i++ ){
			if(prices[i] > maxPrice){
				maxPrice = Math.max(maxPrice,prices[i]);
			}
			
		}
        return maxPrice;
    }
    
    private static double findMinPrice(double[] prices) {
        double minPrice = prices[0];
        for (int i = 0; i<prices.length-1;i++ ) {
            if (prices[i] < minPrice) {
                minPrice = Math.min(minPrice,prices[i]);
            }
        }
        return minPrice;
    }


    private static double calculateTotalCost(double laptopCost, double driveCost) {
        return (laptopCost + driveCost) * (1 + TAX_RATE);
    }

    private static double applyDiscount(double totalCost) {
        double discount = 0.0;
        if (totalCost >= 1750) {
            discount = totalCost * 0.15;
        } else if (totalCost > 1500 && totalCost < 1750) {
            discount = totalCost * 0.10;
        } else if (totalCost > 1000 && totalCost <= 1500) {
            discount = totalCost * 0.05;
        }
        return totalCost - discount;
    }

}
