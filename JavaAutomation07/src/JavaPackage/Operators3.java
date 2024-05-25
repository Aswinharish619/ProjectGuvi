package JavaPackage;

import java.util.Scanner;

public class Operators3 {

	public static void main(String[] args) {
		int a,b;
			
		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter Value of A");
		a=scn.nextInt();
		System.out.println("Enter Value of B");
		b=scn.nextInt();
		if (a > b) {

			System.out.println("A is Greater than B");
		} else {
			System.out.println("B is Greater than A");
		}

	}

}
