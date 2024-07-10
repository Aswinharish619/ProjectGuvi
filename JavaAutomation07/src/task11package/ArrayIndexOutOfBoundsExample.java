package task11package;

public class ArrayIndexOutOfBoundsExample {
	
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            int number = numbers[10];
            System.out.println("Number at index 10: " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds");
            System.out.println("Exception message: " + e.getMessage());
        }
    }

	

}
