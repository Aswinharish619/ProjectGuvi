package exception_Handeling;

public class MultipleCatchException {

	public static void main(String[] args) {
		
		try {
			int a =10;
			int b=4;
			int div;
			div=a/b;
			System.out.println(div);
			
			int array[]= {75,85,365,55};	
			System.out.println(array[7]);
		}
		catch(ArithmeticException a){
			System.out.println("Cant div by Zero");
		}
		catch(ArrayIndexOutOfBoundsException ai){
			System.out.println("Out of Index");
		}
		catch(NumberFormatException C) {
			System.out.println("Number Format");
		}
		finally {
			System.out.println("Finally block Executed");
		}

	}

}
