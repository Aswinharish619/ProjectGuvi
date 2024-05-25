package task11package;

import java.util.Scanner;

public class DivisionExample {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Reading first integer input
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();
            
            // Reading second integer input
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();
            
            // Performing division
            int result = divide(num1, num2);
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handling any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
    
    // Method to perform division
    public static int divide(int dividend, int divisor) throws ArithmeticException {
        return dividend / divisor;
    }

}
