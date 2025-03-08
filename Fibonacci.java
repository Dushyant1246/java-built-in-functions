import java.util.Scanner;

// Fibonacci Sequence Generator
class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = scanner.nextInt();
        printFibonacci(n);
        scanner.close();
    }
    
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}
/*
Enter the number of terms for Fibonacci sequence: 12
Fibonacci Sequence: 0 1 1 2 3 5 8 13 21 34 55 89
*/