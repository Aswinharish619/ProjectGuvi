package JavaPackage;

public class Patten2 {
	
	public static void main(String[] args) {
int n= 5; // for rows
		
		int m=5; // Columns 
		
		for (int i=1; i<=n; i++) { //rows 
			
			for(int j=1; j<=m;j++)
		
				{
				
				if(i==i||j==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		
	}
	}

}
