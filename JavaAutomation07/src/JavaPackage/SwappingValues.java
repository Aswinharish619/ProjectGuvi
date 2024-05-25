package JavaPackage;

public class SwappingValues {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping:A="+a);
		System.out.println("B="+b);

		int 
		temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);


	}

}
