package Java_oops;

public class Dog implements Animal1 {

	public static void main(String[] args) {
		
		Dog obj = new Dog();
		
		obj.eat();
		obj.sleep();
		
	}

	@Override
	public void eat() {
		
		System.out.println("Eat Method is implimented");
		
	}

	@Override
	public void sleep() {
		
		System.out.println("Sleep Method is implimented");
		
	}

}
