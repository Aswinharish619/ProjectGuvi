package task11package;

class DefaultClass { // Default access modifier

	int valueDefault; // Default Variable

	void normalMethod() { // Default method

		/*
		 * Class: Accessible only within the same package. If no access modifier is
		 * specified, it is the default. Methods and Variables: Accessible only within
		 * the same package. Significance: Useful for package-level encapsulation. It
		 * restricts access to classes, methods, or variables within the same package,
		 * which is useful for grouping related classes together.
		 */
	}
}

class ParentClass {

	protected int protectedValue; // protected variable

	protected void protectedMethod() { // protected method
		// method logic
	}
}

class ChildClass extends ParentClass {
	void accessProtected() {
		protectedValue = 10; // accessible
		protectedMethod(); // accessible
	}

	/*
	 * Class: Protected classes are not allowed. Only inner classes can be
	 * protected. Methods and Variables: Accessible within the same package and by
	 * subclasses (even if they are in different packages). Significance: Allows for
	 * a controlled level of inheritance, enabling subclasses to access and modify
	 * superclass methods and variables while still restricting access to unrelated
	 * classes.
	 */
}

public class AccessModifiers {// public is the access modifier

	/*
	 * Class: Accessible from any other class Methods and Variables: Accessible from
	 * any other class. Significance: Provides the least restrictive access. It is
	 * used for methods and variables that need to be accessible from anywhere in
	 * the application.
	 */
	public int publicValue;

	public void publicMethod() {
		// method logic
	}

	private int pinNumber = 5678; // variables

	private void secretMethod() { // methods
		// method logic for private method
	}

	/*
	 * Class: Private classes are not allowed. Only inner classes can be private.
	 * Methods and Variables: Accessible only within the same class. Significance:
	 * Ensures that the implementation details are hidden from other classes. It is
	 * used to encapsulate and protect data from unintended modification.
	 */

}
