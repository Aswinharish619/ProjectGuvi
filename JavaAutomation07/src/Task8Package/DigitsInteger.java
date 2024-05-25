package Task8Package;

import java.util.Scanner;

public class DigitsInteger {
	
	public static void main(String[] args) {
		
		System.out.println("Enther the Interger Here -->");
		
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		int length= String.valueOf(num).length();
		
		System.out.println("Number of Digits in Integer is -->"+length);
	}

}
