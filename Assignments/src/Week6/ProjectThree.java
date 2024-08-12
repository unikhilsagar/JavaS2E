package Week6;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class ProjectThree {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		//Scanner 
		Scanner sc = new Scanner(System.in);
						
		//Declaring variables
		String visitingDay;
		
		//Tax Rate
		final double TAX_RATE = 4.75;
		
		//Lap Top Rates
		final String LENOVO_LAPTOP_RATE = "1,950.89";
		final String DELL_LAPTOP_RATE = "910.54";
		final String HP_LAPTOP_RATE = "1,345.95";
		final String ASUS_LAPTOP_RATE = "506.00";
		
		//Hard disk rates
		final String STARTECH_HARDDISK_RATE = "50.55";
		final String SEAGATE_HARDDISK_RATE = "75.00";
		final String SANDISK_HARDDISK_RATE = "199.99";
		final String WD_HARDDISK_RATE = "129.99";
		
		
		
		//isOpen to determine what you are visiting the store 
		boolean isOpen = false,inValidDay = false ;
		String welcomeStatementBeforeSplit = "WelcometoSimplifiedComputer";
		String availableStatement = "We are open Monday to Thursday from 9am to 6pm";
		String welComeStatementAfterSplit = "";
		
		//splitting the statement WelcometoSimplified using substring method
		//and storing it in a string variable 'welcomestatementaftersplit'
		welComeStatementAfterSplit = welcomeStatementBeforeSplit.substring(0, 7) + " " + welcomeStatementBeforeSplit.substring(7, 9) + " " + welcomeStatementBeforeSplit.substring(9, 19) + " " + welcomeStatementBeforeSplit.substring(19,27);
		
		
		//replace Thursday with Friday
		availableStatement.replace("Thursday", "Friday");
				
		//trim is used to cut spaces at the front and end
		System.out.println(welComeStatementAfterSplit.trim());
		System.out.println(availableStatement.replace("Thursday", "Friday"));
		System.out.println("");
		System.out.print("What day are you visiting the store?");
		
		visitingDay = sc.next();
			
		//handling case insensitive
		switch(visitingDay.toLowerCase()) {
			case "monday":
				isOpen = true;
				break;
			case "tuesday":
				isOpen = true;
				break;
			case "wednesday":
				isOpen = true;
				break;
			case "thursday":
				isOpen = true;
				break;
			case "friday":
				isOpen = true;
				break;
			case "saturday":
				isOpen = false;
				break;
			case "sunday":
				isOpen = false;
				break;
			default: // if user enter a wrong or incorrect day
				inValidDay = true;
				System.out.println("Invalid day");
				break;
					
			}
		
		
		
		if(isOpen) { // this will execute if the day is from Monday to Friday
			
			//using '\n' to print in next line
			System.out.println("You are welcome to the store");
			System.out.println("");
			System.out.println("Laptops \nLenovo =$" + LENOVO_LAPTOP_RATE + " \nDell=$" + DELL_LAPTOP_RATE + "\nHp=$"+HP_LAPTOP_RATE + "\nAsus= $"+ASUS_LAPTOP_RATE);
			System.out.println("");
			System.out.println("External Drives \nStartech=$" + STARTECH_HARDDISK_RATE +"\nSeagate=$"+SEAGATE_HARDDISK_RATE + "\nSandisk=$"+SANDISK_HARDDISK_RATE+"\nWd=$"+ WD_HARDDISK_RATE);
			
			//calculating max and min value of laptops
			double[] laptopPrices = {1950.89,910.54,1345.95,506.00};
			
			double maxLaptopPrice = laptopPrices[0];
			for(int i =1;i<laptopPrices.length-1;i++) {
				double maxPrice = Math.max(maxLaptopPrice, laptopPrices[i]);
				if(maxPrice > maxLaptopPrice) {
					maxLaptopPrice = maxPrice;
				}
			}
			
			double minLaptopPrice = laptopPrices[0];
			for(int i =1;i<laptopPrices.length-1;i++) {
				double minPrice = Math.min(maxLaptopPrice, laptopPrices[i]);
				if(minPrice < minLaptopPrice) {
					minLaptopPrice = minPrice;
				}
				//minLaptopPrice = Math.min(minLaptopPrice, laptopPrices[i]);
			}
			
			System.out.println("The most expensive laptop cost:$" + maxLaptopPrice);
			System.out.println("The least expensive laptop cost:$" + minLaptopPrice);
			
			System.out.println("");
			
			//calculating max and min value of external disks
			double[] externalHardDisk = {199.99,50.55,75.00,129.99};
			
			double maxExternalHardDisk = externalHardDisk[0];
			
			for(int i =1;i<externalHardDisk.length-1;i++) {
				double maxExternalPrice = Math.max(maxExternalHardDisk, externalHardDisk[i]);
				if(maxExternalPrice > maxExternalHardDisk) {
					maxExternalHardDisk = maxExternalPrice;
				}
			}
			
			double minExternalHardDisk = externalHardDisk[0];
			for(int i =1;i<laptopPrices.length-1;i++) {
				double minExternalPrice = Math.min(minExternalHardDisk, externalHardDisk[i]);
				if(minExternalPrice < minExternalHardDisk) {
					minExternalHardDisk = minExternalPrice;
				}
				//minExternalHardDisk = Math.min(minExternalHardDisk, externalHardDisk[i]);
			}
			
			System.out.println("The most expensive External Drive cost:$" + maxExternalHardDisk);
			System.out.println("The least expensive External Drive cost:$" + minExternalHardDisk);
			
			System.out.println("");
			
			String laptopBrand = "", externalDrive = "", externalDriveYesOrNo = "";
			double laptopCost,externalDriveCost, totalCost, taxAmount;
			System.out.print("What laptop branch would you like(Lenovo/Dell/HP/Asus)?");
			laptopBrand = sc.next();
			
			if(laptopBrand.equalsIgnoreCase("Lenovo")) {
				// Week 5 slide 34
				laptopCost =  Double.parseDouble(LENOVO_LAPTOP_RATE.replace(",", ""));
			} else if(laptopBrand.equalsIgnoreCase("Dell")){
				laptopCost = Double.parseDouble(DELL_LAPTOP_RATE.replace(",", ""));
			} else if(laptopBrand.equalsIgnoreCase("Hp")) {
				laptopCost = Double.parseDouble(HP_LAPTOP_RATE.replace(",", ""));
			} else if(laptopBrand.equalsIgnoreCase("Asus")) {
				laptopCost = Double.parseDouble(ASUS_LAPTOP_RATE.replace(",", ""));
			} else {
				laptopCost = 0.00;
				System.out.println("Invalid laptop brand");
			}
			
			
			
			if(laptopCost > 0) {
				System.out.println("The " + laptopBrand + " laptop cost: $" + laptopCost);
			}
			
			System.out.println("");
			
			System.out.print("Would you like to get an external drive? (Yes/No)");
			externalDriveYesOrNo = sc.next();
			
			if(externalDriveYesOrNo.equalsIgnoreCase("Yes")) {
				
				System.out.print("What External Drive brand would you like (Startech/Seagate/Sandisk/Wd)?");
				externalDrive = sc.next();
				
				if(externalDrive.equalsIgnoreCase("Startech")) {
					externalDriveCost = Double.parseDouble(STARTECH_HARDDISK_RATE);
				} else if(externalDrive.equalsIgnoreCase("Seagate")){
					externalDriveCost = Double.parseDouble(SEAGATE_HARDDISK_RATE);
				} else if(externalDrive.equalsIgnoreCase("Sandisk")) {
					externalDriveCost = Double.parseDouble(SANDISK_HARDDISK_RATE);
				} else if(externalDrive.equalsIgnoreCase("Wd")) {
					externalDriveCost = Double.parseDouble(WD_HARDDISK_RATE);
				} else {
					externalDriveCost = 0.00;
					System.out.println("Invalid External Drive brand");
				}
				
			} else {
				externalDriveCost = 0.00;
				System.out.println("Please get one next Time");
			}
			
			if(externalDriveCost > 0) {
				System.out.println("The " + externalDrive + " Drive cost: $" + externalDriveCost);
			}
			
			
			System.out.println("");
			
			
			totalCost = laptopCost + externalDriveCost;
			
			//calculating discount amount
			double discountAmount = 0.00;
			
			if(totalCost >= 1750) {
				discountAmount = totalCost * 0.15;
			} else if(totalCost >= 1500) {
				discountAmount = totalCost * 0.10;
			} else if(totalCost >= 1000) {
				discountAmount = totalCost * 0.05;
			} 
			
			totalCost = totalCost - discountAmount;
			
			
			//calculating tax amount
			taxAmount = totalCost * (TAX_RATE/100);
			
			
			//total billing cost after discounts and taxes
			totalCost = totalCost + taxAmount;
			
			//Reference for code this is chapter 3 NumberFormat
			//Initially in my computer it was giving sterling pound symbol so I searched google to fix this issue
			//below is the link for stackOverflow
			//https://stackoverflow.com/questions/4392824/pound-sign-from-number-format
			NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
			
			//numberFormat.setMaximumFractionDigits(2);
			System.out.println("The total price is: "+ numberFormat.format(totalCost));
			
		} else if(!inValidDay){//this will execute when Saturday and Sunday 
			System.out.println("The store is closed");
		}
		
	}
 
}
