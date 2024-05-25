package task11_invalidageexception;

public class AgeValidator {
	
	public void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Exception Message: Age must be 18 or older. Entered age: " + age);
        }
        System.out.println("Age is valid.");
    }

}
