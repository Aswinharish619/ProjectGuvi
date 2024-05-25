package Task10Package;

public class Tea {

	// Method to prepare basic tea with hot water and tea leaves
	public void prepareTea() {
		System.out.println("Preparing basic tea with hot water and tea leaves...");
	}

	// Method to add milk to the basic tea
	public void addMilk() {
		System.out.println("Adding milk to the tea...");
	}

	// Method to add sugar to the basic tea
	public void addSugar() {
		System.out.println("Adding sugar to the tea...");
	}

	public static void main(String[] args) {
		// Creating an instance of Tea
		Tea myTea = new Tea();

		// Preparing basic tea
		myTea.prepareTea();

		// Adding milk to the tea
		myTea.addMilk();

		// Adding sugar to the tea
		myTea.addSugar();
	}

}
