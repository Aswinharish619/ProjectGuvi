package task_5;

import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args)

	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int n = scanner.nextInt();

		int num = 1; // Start with 1

		for (int i = 1; i <= n; i++) 
		{
			
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(num + " "); // Print the current number
				num++; 
			}
			System.out.println(); // Move to the next line after each row
		}

		scanner.close();
	}
}
