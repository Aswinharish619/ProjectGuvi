package Task8Package;

import java.util.Scanner;

public class PrimeOrNot {

	public static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner scn1=new Scanner(System.in);
		
		System.out.println("Enter the Number to check-->");

		int number = scn1.nextInt();
		if (isPrime(number)) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}

}
