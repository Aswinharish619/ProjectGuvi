package task_5;

import java.util.Scanner;

public class Program_5 {

	
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input integer for the marks <100
	        System.out.print("Enter the marks: ");
	        int marks = scanner.nextInt();

	        // Output the grade
	        if (marks > 100) {
	            System.out.println("Invalid Input");
	        } else if (marks >= 90) {
	            System.out.println("S");
	        } else if (marks >= 80) {
	            System.out.println("A");
	        } else if (marks >= 70) {
	            System.out.println("B");
	        } else if (marks >= 60) {
	            System.out.println("C");
	        } else if (marks >= 50) {
	            System.out.println("D");
	        } else if (marks >= 40) {
	            System.out.println("E");
	        } else {
	            System.out.println("F");
	        }

	        scanner.close();
	    }
}
