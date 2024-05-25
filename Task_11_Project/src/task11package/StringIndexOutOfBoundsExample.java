package task11package;

public class StringIndexOutOfBoundsExample {
	
	public static void main(String[] args) {
        String text = "Hello, world!";
        
        try {
            char ch = text.charAt(20);
            System.out.println("Character at index 20: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }

}
