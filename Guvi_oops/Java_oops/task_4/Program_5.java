package task_4;

import java.util.Scanner;

public class Program_5 {

	public static void main(String[] args) {
		// CHeck Entered number is prime or not
		
		Scanner sc11= new Scanner(System.in);
		
		System.out.println("Enter the postive value greater than 1");
		
		int a11= sc11.nextInt();
		
		if (	  a11 > 1 && // Ensure the number is greater than 1
				  a11 % 2 != 0 && // Not divisible by 2
				  a11 % 3 != 0 && // Not divisible by 3
				  a11 % 5 != 0 && // Not divisible by 5
				  a11 % 7 != 0 // Not divisible by 7
				) {
			
			System.out.println("Given Number is prime number");
			
		}else {
			
			System.out.println("Given Number is not a prime number");
		}
		

	}

}
