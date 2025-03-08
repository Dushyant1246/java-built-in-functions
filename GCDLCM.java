import java.util.Scanner;
// GCD and LCM Calculator
class GCDLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers to calculate GCD and LCM: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));
        scanner.close();
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
/*
Enter two numbers to calculate GCD and LCM: 24 66
GCD of 24 and 66 is: 6
LCM of 24 and 66 is: 264
*/