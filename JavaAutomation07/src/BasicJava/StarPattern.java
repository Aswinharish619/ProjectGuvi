package BasicJava;

public class StarPattern {
	

	 public static void main(String[] args) {
	        int size = 5; 

	        // Loop rows
	        for (int i = 0; i < size; i++) {
	            // Loop columns
	            for (int j = 0; j < size; j++) {
	                // Print '*' at the positions where i equals j or (size - 1 - i) equals j
	                if (i == j || (size - 1 - i) == j) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
		}

	
	
