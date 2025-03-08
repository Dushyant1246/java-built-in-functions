import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100, and I'll try to guess it!");

        while (!guessedCorrectly) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'h' for too high, 'l' for too low, 'c' for correct)");
            char feedback = getUserFeedback(scanner);

            if (feedback == 'c') {
                System.out.println("I guessed your number!");
                guessedCorrectly = true;
            } else {
                int[] updatedRange = updateRange(low, high, guess, feedback);
                low = updatedRange[0];
                high = updatedRange[1];
            }
        }
        scanner.close();
    }

    // Function to generate a random guess within the range
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Function to get user feedback
    public static char getUserFeedback(Scanner scanner) {
        char response;
        while (true) {
            response = scanner.next().charAt(0);
            if (response == 'h' || response == 'l' || response == 'c') {
                return response;
            }
            System.out.println("Invalid input. Please enter 'h' for too high, 'l' for too low, or 'c' for correct.");
        }
    }

    // Function to update the range based on user feedback
    public static int[] updateRange(int low, int high, int guess, char feedback) {
        if (feedback == 'h') {
            high = guess - 1;
        } else if (feedback == 'l') {
            low = guess + 1;
        }
        return new int[]{low, high};
    }
}

/*
Think of a number between 1 and 100, and I'll try to guess it!
Is your number 11? (Enter 'h' for too high, 'l' for too low, 'c' for correct)
l
Is your number 21? (Enter 'h' for too high, 'l' for too low, 'c' for correct)
l
Is your number 27? (Enter 'h' for too high, 'l' for too low, 'c' for correct)
l
Is your number 94? (Enter 'h' for too high, 'l' for too low, 'c' for correct)
h
Is your number 68? (Enter 'h' for too high, 'l' for too low, 'c' for correct)
l
Is your number 80? (Enter 'h' for too high, 'l' for too low, 'c' for correct)
h
Is your number 76? (Enter 'h' for too high, 'l' for too low, 'c' for correct)
h
Is your number 69? (Enter 'h' for too high, 'l' for too low, 'c' for correct)
c
I guessed your number!

*/