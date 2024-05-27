package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayList {

	public static void main(String[] args) {
		
		List<String> stringlist= Arrays.asList("China","Japan","India","Pakistan");
		
		// Print the original List
        System.out.println("Original List: " + stringlist);

        // Convert the List to an ArrayList
        ArrayList<String> arrayList = new ArrayList<>(stringlist);

        // Print the ArrayList
        System.out.println("Converted ArrayList: " + arrayList);

	}

}
