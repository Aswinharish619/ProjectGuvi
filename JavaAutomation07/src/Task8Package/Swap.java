package Task8Package;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner scn1= new Scanner(System.in);
		Scanner scn2= new Scanner(System.in);
		
		System.out.println("Enter Number1");
		  int scn11 = scn1.nextInt();
		System.out.println("Enter Number2");
		 int scn12 =scn2.nextInt();
	
		
		int temp=scn11;
		 scn11=scn12;
		 scn12=temp;
		
		System.out.println(" Number1 is " +scn11);
		System.out.println(" Number2 is " +scn12);  
		

	}

}
