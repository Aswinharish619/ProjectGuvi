package exception_Handeling;

import java.util.Scanner;

public class InputMisMatch_Exception {

	public static void main(String[] args) {

		int a =1;
		
		Scanner sc= new Scanner(System.in);
		
		int b= sc.nextInt();
		
		int num= a+b;
		
		System.out.println(num);

	}

}
