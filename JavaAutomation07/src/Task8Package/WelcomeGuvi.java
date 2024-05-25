package Task8Package;

import java.util.Scanner;

public class WelcomeGuvi {

	public static void main(String[] args) {

		System.out.println("Enter the String to Print");
		Scanner sc = new Scanner(System.in);
		String St = sc.nextLine();
		System.out.println("Enter the num of times to Print");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println(St);

		}

	}

}
