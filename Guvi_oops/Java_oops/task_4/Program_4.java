package task_4;

import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		// Get 2 number from the user Swap without any data loss

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.println("Enter value a: ");
		a = sc.nextInt();
		System.out.println("Enter value b: ");
		b = sc.nextInt();

		c = a;
		a = b;
		b = c;

		System.out.println("Swaped value a is : " + a);
		System.out.println("Swaped value b is : " + b);

	}

}
