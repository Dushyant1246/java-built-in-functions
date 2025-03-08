import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class DateArithmetic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input date in dd-MM-yyyy format
		System.out.print("Enter a date (dd-MM-yyyy): ");
		String inputDate = scanner.nextLine();
		
		// Display result
		System.out.println("Date with +7 days, +1 month, +2 years and -3 weeks: " + calculateDate(inputDate));
	}
	
	public static String calculateDate (String date) {
		
		String resultString = "";
		
		try{
			
		// Parse input date using DateTimeFormatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate resultDate = LocalDate.parse(date, formatter);
		
		// Calculate the required date (+7 days, +1 month, +2 years and -3 weeks)
		resultDate = resultDate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
		
		// format the date into string
		resultString = resultDate.format(formatter);
		
		} catch (DateTimeParseException e) {
			System.err.println("Wrong date format for (dd-MM-yyyy): " + e.getMessage());	// Error message if input isn't in correct format
		}
		
		return resultString;
	}
}
/*
Enter a date (dd-MM-yyyy): 15-11-2002
Date with +7 days, +1 month, +2 years and -3 weeks: 01-12-2004
*/