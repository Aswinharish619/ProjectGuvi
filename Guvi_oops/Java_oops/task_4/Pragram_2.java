package task_4;

import java.util.Scanner;

public class Pragram_2 {// Find even or odd using % operator
	
	public static void main(String[] args) {
		
		Scanner sc1=new Scanner(System.in);
		
		System.out.println(" Enter the value to find even or odd");
		int num= sc1.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.println("Enter value is even number");
		}else {
			
			System.out.println("Enter value is odd number");
		}
	}

}
