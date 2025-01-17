package task_5;

public class Program_4 {
	
	public static void main(String[] args) {
		int n = 5; 
		
		// Loop for row
		for (int i = 1; i <= n; i++) {
			// Loop for column
			for (int j = 1; j <= n; j++) {
				// diagonal check
				if (i == j || i + j == n + 1) {
					System.out.print(" *");
				} else {
					System.out.print("  "); 
				}
			}
			System.out.println(); 
		}
	}
}
