import java.util.Scanner;

// Temperature Converter Class
class TemperatureConverter {
    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit));
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));
        } else {
            System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
}
/*
Temperature Converter:
1. Fahrenheit to Celsius
2. Celsius to Fahrenheit
Choose an option (1 or 2): 2
Enter temperature in Celsius: 45
Temperature in Fahrenheit: 113.0
*/