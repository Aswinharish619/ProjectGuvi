package JavaPackage;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {

		Scanner scn1 = new Scanner(System.in);

		System.out.println("Enter the table Nub to print");

		int table = scn1.nextInt();

		for (int n = 1; n <= 10; n++) {

			int i = n * table;
			System.out.println(+i);

			
		}

	}

}
