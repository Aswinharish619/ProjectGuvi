package task_6;

public class Person {

	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter method for name
	public String getName() {
		return name;
	}

	// Setter method for age
	public void setName(String name) {
		this.name = name;
	}

	// getter method for age
	public int getAge() {
		return age;

	}

	// Setter method for age
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Person person = new Person("Alice", 30); 
		
		System.out.println("Name: " + person.getName()); 
		System.out.println("Age: " + person.getAge()); 
		
		person.setName("Bob"); person.setAge(25); 
		//access the modified fields 
		System.out.println("Updated Name: " + person.getName());
		System.out.println("Updated Age: " + person.getAge());

	}

}
