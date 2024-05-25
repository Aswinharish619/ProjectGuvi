package Task9Package;

import java.util.Scanner;

public class ReverseString {

	public static String reverseString(String str) {
		int length = str.length();
		String reversed = "";

		for (int i = length - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		return reversed;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		
		String input = scanner.nextLine();

		String reversed = reverseString(input);

		System.out.println("Reversed string: " + reversed);
	}

}
