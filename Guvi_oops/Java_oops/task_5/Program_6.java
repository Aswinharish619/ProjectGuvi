package task_5;

import java.util.Scanner;

public class Program_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// input details
		System.out.print("Enter the month (1-12): ");
		int month = scanner.nextInt();

		System.out.print("Enter the room rent per day: ");
		float roomRentPerDay = scanner.nextFloat();

		System.out.print("Enter the number of days stayed: ");
		int numberOfDays = scanner.nextInt();

		// month is a peak season
		boolean isPeakSeason = false;
		switch (month) {
		case 4: // April
		case 5: // May
		case 6: // June
		case 11: // November
		case 12: // December
			isPeakSeason = true;
			break;
		default:
			isPeakSeason = false;
		}

		// Calculate the total tariff
		float totalTariff = roomRentPerDay * numberOfDays;
		if (isPeakSeason) {
			totalTariff += totalTariff * 0.20f; // Add 20% for peak season
		}

		// Output total tariff with 2 decimal places
		System.out.printf("Total Tariff: %.2f\n", totalTariff);

		scanner.close();
	}

}
