import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

class DateFormatter{
	public static void main(String[] args) {
		// Get current date
		LocalDate currentDate = LocalDate.now();
		
		// Variable to store date in different formats
		String[] formattedDate = formatDate(currentDate);
		
		//Display date in different formats
		System.out.println("Current date in different formats: ");
		System.out.println(formattedDate[0]);
		System.out.println(formattedDate[1]);
		System.out.println(formattedDate[2]);
	}
	
	public static String[] formatDate(LocalDate date) {
		
		// Create different formats
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		
		// return array of dates with different formats
		return new String[]{date.format(formatter1), date.format(formatter2), date.format(formatter3)};
	}
}

/*
Current date in different formats:
08/03/2025
2025-03-08
Sat, Mar 08, 2025
*/