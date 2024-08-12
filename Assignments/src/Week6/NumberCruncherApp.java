package Week6;

import java.util.Arrays;
import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.*;

public class NumberCruncherApp {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create array of 11 random integers
		LocalDateTime dateTime = LocalDateTime.of(2002, 3, 2, 23, 15, 30);
		DateTimeFormatter dtf = 
		    DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(dtf.format(dateTime));


		
		
		
		



		
	}

}
