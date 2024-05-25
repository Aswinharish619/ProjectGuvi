package task11_invalidageexception;

public class Main {

	public static void main(String[] args) {

		AgeValidator ageValidator = new AgeValidator();
		int age = 16; // user input

		try {
			ageValidator.validateAge(age);
		} catch (InvalidAgeException e) {
			// Display error message
			System.out.println(e.getMessage());
		}

	}

}
