package task_6;

public class Employee {
	
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

	// Getter method for id
	public int getId() {
		return id;
	}

	// Getter method for firstName
	public String getFirstName() {
		return firstName;
	}

	// Getter method for lastName
	public String getLastName() {
		return lastName;
	}

	// Getter method for full name
	public String getName() {
		return firstName + " " + lastName;
	}

	// Getter method for salary
	public int getSalary() {
		return salary;
	}

	// Setter method for salary
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Method to get annual salary
	public int getAnnualSalary() {
		return salary * 12;
	}

	// Method to raise salary by a percentage
	public int raiseSalary(int percent) {
		salary += salary * percent / 100;
		return salary;
	}

	// toString method to return a string representation of the employee
	@Override
	public String toString() {
		return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// Create a new Employee object using the constructor
		Employee emp = new Employee(1, "John", "Doe", 5000);

		// Use getter methods to access the fields
		System.out.println("ID: " + emp.getId());
		System.out.println("Name: " + emp.getName());
		System.out.println("Salary: " + emp.getSalary());

		// Use setter method to modify the salary
		emp.setSalary(6000);

		// Use getter method to access the modified salary
		System.out.println("Updated Salary: " + emp.getSalary());

		// Get annual salary
		System.out.println("Annual Salary:(*12) " + emp.getAnnualSalary());

		// Raise salary by 10%
		emp.raiseSalary(10);
		System.out.println("New Salary after 10% raise: " + emp.getSalary());

		// Print the employee details using   toString method
		System.out.println(emp.toString());
	}
}
