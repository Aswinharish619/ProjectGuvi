package Task9Package;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HotelRent {
	

		
		 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of months, room rent per day, and number of days
        System.out.print("Enter the number of months (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the room rent per day: ");
        double roomRentPerDay = scanner.nextDouble();
        System.out.print("Enter the number of days at the hotel: ");
        int numOfDays = scanner.nextInt();

        // Calculate the room rent based on the input
        double roomRent = calculateRoomRent(month, roomRentPerDay, numOfDays);
        
     // Format the room rent to two decimal points
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedRoomRent = df.format(roomRent);

        System.out.println("Room Rent: " + formattedRoomRent);

        scanner.close();
    }

	 public static double calculateRoomRent(int month, double roomRentPerDay, int numOfDays) {
		 double totalRoomRent = roomRentPerDay * numOfDays;

	        // Apply a 20% increase during April to June and November to December
	        switch (month) {
	            case 4: //April
	            case 5: //May
	            case 6: //June
	            case 11: //November
	            case 12: //December
	                totalRoomRent *= 1.2;
	                break;
	            default:
	                break;
	        }

	        return totalRoomRent;
	    }

}
