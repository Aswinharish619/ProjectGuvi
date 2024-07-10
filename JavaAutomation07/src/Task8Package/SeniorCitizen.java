package Task8Package;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {

		System.out.println("Enter the Person Age to Identify Seniority ");
		
		Scanner sc= new Scanner(System.in);
		int Age = sc.nextInt();
		
		if (Age >=60) {
			System.out.println("Person is Senior Citizen");
		}else {
			System.out.println("Not a Senior Citizen");
		}
		

	}

}
