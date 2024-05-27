package others;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeMapProgram {

	public static void main(String[] args) {
		// Create a TreeMap of employee IDs and names
		TreeMap<Integer,String> employeeMap= new TreeMap<>();
		
		// Add some employee IDs and names to the TreeMap
        employeeMap.put(1001, "Ram Krishna");
        employeeMap.put(1002, "Mohammed Siddiqu");
        employeeMap.put(1003, "Ajay Prakash");
        employeeMap.put(1004, "Shankar Diwan");
        employeeMap.put(1005, "Rajesh Kumar");
       
        // Create a list of the employee names
        List<String> employeeNames = new ArrayList<>(employeeMap.values());
        
        // Sort the list of names in alphabetical order
        Collections.sort(employeeNames);

        
        System.out.println("Employee names in alphabetical order:");
        
        for (String name : employeeNames) {
            System.out.println(name);
        
        }
	}

}
