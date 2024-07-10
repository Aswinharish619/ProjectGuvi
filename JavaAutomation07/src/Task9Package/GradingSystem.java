package Task9Package;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number between 1 and 100: ");
		int mark = scanner.nextInt();
		String grade;

		// Grade based on the range of the number
		if (mark == 100 ) {
			grade = "S";
		} else if (mark > 90 && mark <= 99) {
			grade = "A";
		} else if (mark > 80 && mark <= 89) {
			grade = "B";
		} else if (mark > 70 && mark <= 79) {
			grade = "C";
		} else if (mark > 60 && mark <= 69) {
			grade = "D";
		}else if (mark > 50 && mark <= 59) {
			grade = "E";
		}else {
			grade = "F";
		}

		System.out.println("Grade: " + grade);

		scanner.close();
	}

	}
