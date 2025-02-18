package task10_Package;

public class ZeroException {

	public static void main(String[] args) {
		
		int a=15;
		int b=0;
		try {
			
			int c= a/b;//Error code
			
		}catch(ArithmeticException ex){
			
			System.out.println("Error Message -->"+ex.getMessage());
			
		}
		finally {
			
			System.out.println("ArithmeticException class");
			
		}

	}

}
