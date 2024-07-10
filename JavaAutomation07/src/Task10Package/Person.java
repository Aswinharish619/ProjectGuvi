package Task10Package;

public class Person {

	public String name;
	public int age;

	public Person(String name, int age) // constructor
	{
		this.name = name;
		this.age = age;
	}

	public String getName() // getter Name
	{
		return name;
	}

	public int getAge() // getter Age
	{
		return age;
	}

	public static void main(String[] args) {

		Person person1 = new Person("Ram", 25);

		System.out.println("Name: " + person1.getName());
		System.out.println("Age: " + person1.getAge());

	}

}
