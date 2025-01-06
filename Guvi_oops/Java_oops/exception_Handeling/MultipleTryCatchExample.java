package exception_Handeling;

public class MultipleTryCatchExample {

	public static void main(String[] args) {
		
		try {
			int a =10;
			int b=3;
			int div;
			div=a/b;
			System.out.println(div);
		}
		catch(ArithmeticException a){
			System.out.println("Cant div by Zero");
		}
		try {
		int a[]= {10,20,30,40};	
		System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Out of Index");
		}
		try {
			int a= Integer.parseInt(null);
			System.out.println(a);
			}
			catch(NumberFormatException NM) {
				System.out.println("NumberFormatException");
			}
		

	}

}
