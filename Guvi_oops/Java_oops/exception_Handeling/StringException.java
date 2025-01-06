package exception_Handeling;

public class StringException {

	public static void main(String[] args) {
		
		String st="GUVI JAVA";
		
		try {
			char ch = st.charAt(10);
			System.out.println(ch);
		}
		catch(StringIndexOutOfBoundsException str) {
			
			System.out.println("StringIndexOutOfBoundsException");
			
		}

	}

}
