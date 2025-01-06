package task_4;

import java.util.Scanner;

public class FourIntegerVariable {

	public static void main(String[] args) {// Four Integer Variable which is greater 
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter int a:");
		int a = sc.nextInt();
		System.out.println("Enter int b:");
		int b= sc.nextInt();
		System.out.println("Enter int c:");
		int c =sc.nextInt();
		System.out.println("Enter int d:");
		int d =sc.nextInt();
		
		if((a+b)>(c+d)){
			
			System.out.println("Sum of a and b is greater than Sum on c and d");
			
		}
		else {
			System.out.println("Sum on c and d is greater ");
		}
		
		 

	}

}
