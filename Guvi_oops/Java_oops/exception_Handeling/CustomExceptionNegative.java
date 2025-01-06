package exception_Handeling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	InvalidAgeException(String msg){
		
		System.out.println(msg);
	}
}

public class CustomExceptionNegative {

	public static void main(String[] args) {
		
		Scanner sc1= new Scanner(System.in); 
		System.out.println("Enter the age");
		int age =sc1.nextInt();
		try {
			negativeage(age); 
		}catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
	
	static void negativeage(int age) throws InvalidAgeException {
		
		if(age < 0) {
			
			throw new InvalidAgeException ("Age is Negative");
		}
		else {
			System.out.println("Age is" + age);
		}
		
	}

}
