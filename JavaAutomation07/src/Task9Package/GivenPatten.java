package Task9Package;

import java.util.Scanner;

public class GivenPatten {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Patten length");

		int sc1 = sc.nextInt();

		int num = 1;
		int print =1;

		for (int i = 0; i <= sc1; i++) {
			
			for (int j =1 ; j <= i; j++) {
				
				System.out.print(print);
				print ++;

			}
			System.out.println("");

		}
	}
}
