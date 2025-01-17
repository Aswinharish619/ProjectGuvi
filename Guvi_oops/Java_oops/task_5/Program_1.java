package task_5;

import java.util.Scanner;

public class Program_1 {
   
	public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check:");
        String input = scanner.nextLine();
        
        boolean isPalindrome = true;

        // Use a for loop to check if the string is a palindrome
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit the loop if characters don't match
            }
        }

        // Use if else to display the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
