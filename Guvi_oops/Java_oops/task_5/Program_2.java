package task_5;

import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = scanner.nextLine();

		// Initialize an empty string to store
		String reversed = "";

		//reverse the string
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i); // Append each character in reverse order
		}

		// reversed string
		System.out.println("Reversed string: " + reversed);
	}
}
