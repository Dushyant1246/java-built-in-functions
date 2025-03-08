import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class DateComparison {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input date in dd-MM-yyyy format
		System.out.print("Enter a date (dd-MM-yyyy): ");
		String inputDate1 = scanner.nextLine();
		System.out.print("Enter another date (dd-MM-yyyy): ");
		String inputDate2 = scanner.nextLine();
		
		try{
			
		// Parse input dates using DateTimeFormatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date1 = LocalDate.parse(inputDate1, formatter);
		LocalDate date2 = LocalDate.parse(inputDate2, formatter);
		
		// Check if the date is before after or equal to other date and display results
		if (date1.isBefore(date2)) System.out.println("First date is before second date");
		else if (date1.isAfter(date2)) System.out.println("First date is after second date");
		else if (date1.isEqual(date2)) System.out.println("First date is equal to second date");
		
		} catch (DateTimeParseException e) {
			System.err.println("Wrong date format for (dd-MM-yyyy): " + e.getMessage());	// Error message if input isn't in correct format
		}
	}
}

/*
Enter a date (dd-MM-yyyy): 03-04-2020
Enter another date (dd-MM-yyyy): 03-09-2020
First date is before second date
*/