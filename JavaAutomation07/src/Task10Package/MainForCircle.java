package Task10Package;

public class MainForCircle {

	public static void main(String[] args) {
		 Circle circle1 = new Circle(); // circle with default radius
	        System.out.println("Circle 1 radius: " + circle1.getRadius());
	        System.out.println("Circle 1 circumference: " + circle1.calculateCircumference());

	        Circle circle2 = new Circle(5.0); // circle with radius 5.0
	        System.out.println("\nCircle 2 radius: " + circle2.getRadius());
	        System.out.println("Circle 2 circumference: " + circle2.calculateCircumference());

	        Circle circle3 = new Circle(3.0, 7.0); //circle with radius 3.0 and 7.0
	        System.out.println("\nCircle 3 radius (average of 3.0 and 7.0): " + circle3.getRadius());
	        System.out.println("Circle 3 circumference: " + circle3.calculateCircumference());

	}

}
