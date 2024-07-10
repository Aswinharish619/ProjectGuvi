package Task10Package;

import java.util.Scanner;

public class ThreeSubclasses {
	
	    // prepare basic tea
	    public void prepareTea() {
	        System.out.println("Preparing basic tea with hot water and tea leaves...");
	    }

	    //add milk to the basic tea
	    public void addMilk() {
	        System.out.println("Adding milk to the tea...");
	    }

	    //add sugar to the basic tea
	    public void addSugar() {
	        System.out.println("Adding sugar to the tea...");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // option to type of tea
	        System.out.println("Choose the type of tea: 1. Black Tea, 2. Green Tea, 3. Herbal Tea");
	        int choice = scanner.nextInt();

	        ThreeSubclasses tea;
	        switch (choice) {
	            case 1:
	                tea = new BlackTea();
	                break;
	            case 2:
	                tea = new GreenTea();
	                break;
	            case 3:
	                tea = new HerbalTea();
	                break;
	            default:
	                System.out.println("Invalid choice. Preparing basic tea.");
	                tea = new ThreeSubclasses();
	        }

	        // Prepare the tea
	        tea.prepareTea();

	        // add milk
	        System.out.println("Would you like to add milk? (yes/no)");
	        String addMilk = scanner.next();
	        if (addMilk.equalsIgnoreCase("yes")) {
	            tea.addMilk();
	        }

	        //add sugar
	        System.out.println("Would you like to add sugar? (yes/no)");
	        String addSugar = scanner.next();
	        if (addSugar.equalsIgnoreCase("yes")) {
	            tea.addSugar();
	        }

	        scanner.close();
	    }
	}

	//BlackTea
	class BlackTea extends ThreeSubclasses {
	    @Override
	    public void prepareTea() {
	        System.out.println("Preparing Black Tea: adding black tea leaves in hot water for 3-5 minutes...");
	    }
	}

	// GreenTea
	class GreenTea extends ThreeSubclasses {
	    @Override
	    public void prepareTea() {
	        System.out.println("Preparing Green Tea: adding green tea leaves in hot water for 2-3 minutes...");
	    }
	}

	// HerbalTea
	class HerbalTea extends ThreeSubclasses {
	    @Override
	    public void prepareTea() {
	        System.out.println("Preparing Herbal Tea: adding herbal tea blend in hot water for 5-7 minutes...");
	    }
	}


