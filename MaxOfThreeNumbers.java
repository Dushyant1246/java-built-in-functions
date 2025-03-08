import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input
        int num1 = getInput(scanner, "Enter first number: ");
        int num2 = getInput(scanner, "Enter second number: ");
        int num3 = getInput(scanner, "Enter third number: ");
        
        // Finding the maximum
        int max = findMax(num1, num2, num3);
        
        // Displaying the result
        System.out.println("The maximum number is: " + max);
        
        scanner.close();
    }
    
    // Function to get input from user
    public static int getInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
    
    // Function to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
/*
Enter first number: 3
Enter second number: 6
Enter third number: 11
The maximum number is: 11
*/