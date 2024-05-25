package JavaPackage;

import java.util.Scanner;

public class looping {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scn.nextInt();
		int print = 1;

		
		while (print <= n) {
			System.out.print(+print + " ");
			print++;
		}
		System.out.println( "Done");
	}

}
