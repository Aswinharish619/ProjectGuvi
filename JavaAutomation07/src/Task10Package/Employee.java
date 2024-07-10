package Task10Package;

public class Employee {
	// Attributes
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	// Constructor
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	// Getters
	public int getID() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	// Setter
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Other Methods
	public int getAnnualSalary() {
		return salary * 12;
	}

	public int raiseSalary(int percent) {
		if (percent > 0) {
			double increase = salary * percent / 100.0;
			salary += increase;
			return salary;
		} else {

			return salary; // Return current salary if percentage is invalid
		}
	}

	// toString method
	@Override
	public String toString() {
		return "Employee [name=" + getName() + ", ID=" + id + ", salary=" + salary + "]\n";
	}
}
