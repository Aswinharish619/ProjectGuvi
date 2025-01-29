package task_6;

public class Circle {
	// Private field
	private double radius;

	// No-argument constructor
	public Circle() {
		this.radius = 1.0; 
	}

	// Constructor with one argument
	public Circle(double radius) {
		this.radius = radius;
	}

	
	public double getRadius() {
		return radius;
	}

	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	//calculate the circumference
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		System.out.println("Circle 1 radius: " + circle1.getRadius());
		System.out.println("Circle 1 circumference: " + circle1.getCircumference());

		//constructor with one argument
		Circle circle2 = new Circle(5.0);
		System.out.println("Circle 2 radius: " + circle2.getRadius());
		System.out.println("Circle 2 circumference: " + circle2.getCircumference());
	}
}
