package task_4;

import java.util.Scanner;

public class Program_9 {

	public static void main(String[] args) {

		// Check the person is senior citizen or not

		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the age to be verified :");
		int age = sc1.nextInt();

		if (age >= 60) {

			System.out.println("Entered person is Senior citizen");
		} else {

			System.out.println(" Not a senoir citizen");

		}

	}

}
