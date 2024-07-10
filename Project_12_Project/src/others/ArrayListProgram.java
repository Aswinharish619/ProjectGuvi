package others;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		// Create an ArrayList of strings
		ArrayList<String> stringList = new ArrayList<>();

		// Add some elements to the ArrayList
		stringList.add("Apple");
		stringList.add("Orange");
		stringList.add("Grape");
		stringList.add("Papaya");
		stringList.add("Mango");

		// Print the ArrayList before removing elements
		System.out.println("ArrayList before removing elements: " + stringList);

		// Remove all elements from the ArrayList
		 while (!stringList.isEmpty()) {
	            stringList.remove(0);
	        }

		// Print the ArrayList after removing elements
		System.out.println("ArrayList after removing elements: " + stringList);

	}
}
