package task_4;

import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        // Ensure the input is non-negative
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using recursion
            long result = factorial(num);

            // Display the result
            System.out.printf("Factorial of %d is: %d%n", num, result);
        }

        // Close the scanner
        scanner.close();
    }

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! is 1
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
}
