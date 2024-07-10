package JavaPackage;

public class Inheritance2 extends Inheritance1 {

	public void multiple(int x, int y) {
		int Multi = x * y;
		System.out.println("Expected value is-->" + Multi);

	}

	public static void main(String[] args) {
		int x, y;

		Inheritance2 obj1 = new Inheritance2();

		obj1.add(10, 30);

		obj1.multiple(10, 30);

	}

}
