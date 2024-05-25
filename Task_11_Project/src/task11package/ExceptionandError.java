package task11package;

public class ExceptionandError {

	// Exception
	/*
	 * Definition -> Represents conditions that a reasonable application might want
	 * to catch. Types-> Checked exceptions (must be caught or declared in the
	 * method signature) and unchecked exceptions (subclasses of RuntimeException).
	 * Examples-> IOException, SQLException, NullPointerException,
	 * ArrayIndexOutOfBoundsException.
	 */

	// Error
	/*
	 * Definition-> Represents serious problems that a reasonable application should
	 * not try to catch. Types-> Typically related to the JVM's operation and
	 * environment. Examples-> OutOfMemoryError, StackOverflowError,
	 * VirtualMachineError
	 */
	// Method causeError throws an Error (StackOverflowError).
	// Although the main method catches the error, in practice, errors typically
	// indicate serious problems that are not meant to be caught and handled by
	// application code.
}
