package Task10Package;

public class Circle {
	
	private double radius;

    // Constructors
    public Circle() {
        // no arguments
        radius = 1.0; // Default radius
    }

    public Circle(double radius) {
        //one argument
        this.radius = radius;
    }

    public Circle(double radius1, double radius2) {
        // two arguments
        this.radius = (radius1 + radius2) / 2; // Average of two radius
    }

    // calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
