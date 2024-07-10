package Task8Package;

import java.util.Scanner;

public class FourIntegers {

	public static void main(String[] args) {
		
		Scanner scn1= new Scanner(System.in);
		Scanner scn2= new Scanner(System.in);
		Scanner scn3= new Scanner(System.in);
		Scanner scn4= new Scanner(System.in);
		
		System.out.println("Eter the Value of A-->");
		int a = scn1.nextInt();
		System.out.println("Eter the Value of B-->");
		int b = scn1.nextInt();
		System.out.println("Eter the Value of C-->");
		int c = scn1.nextInt();
		System.out.println("Eter the Value of D-->");
		int d = scn1.nextInt();
		
		if ((a + b) > (c + d)) { // if statement used
			System.out.println("(a+b) is greater than (c+d) ->" + (a + b));
		} else {

			System.out.println("(c+d) is greater than (a+b) ->" + (c + d));

		}

	}

}
