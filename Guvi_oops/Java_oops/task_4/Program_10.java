package task_4;

import java.util.Scanner;

public class Program_10 {
   
	public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an Postive integer: ");
        int number = scanner.nextInt();

         int digitCount = 0;

        if (number == 0) {
            digitCount = 1;
        } else {
            // Count digits by dividing the number by 10 repeatedly
            while (number > 0) {
                number /= 10;
                digitCount++;
            }
        }

        // Display the result
        System.out.println("Number of digits: " + digitCount);

        // Close the scanner
        scanner.close();
    }
}