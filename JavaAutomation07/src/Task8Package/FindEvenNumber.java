package Task8Package;

import java.util.Scanner;

public class FindEvenNumber {

	public static void main(String[] args) {
		
		Scanner scn1= new Scanner(System.in);
		
		System.out.println("Enter the Number to Check Even or not->");

		int CheckNumb = scn1.nextInt();
		int Output = CheckNumb % 2;

		if (Output > 0) {
			System.out.print(+CheckNumb+" ");
			System.out.println("This is Odd Number");

		} else {
			System.out.print(+CheckNumb +" ");
			System.out.println("This is Even Number");
		}

	}

}
