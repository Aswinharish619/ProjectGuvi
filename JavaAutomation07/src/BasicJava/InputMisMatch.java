package BasicJava;

import java.util.Scanner;

public class InputMisMatch {

	public static void main(String[] args) {

		int i;

		System.out.println("Input the Number");

		Scanner sc = new Scanner(System.in);

		try {

			i = sc.nextInt();
			System.out.println(i);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
