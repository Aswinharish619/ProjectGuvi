package task11_filenotfoundexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileException {

	public static void main(String[] args) {
		
		String fileName = "example.txt"; // the file name

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            //where the file does not exist
            System.err.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            // Handle other I/O errors
            System.err.println("Error reading the file: " + e.getMessage());
        }

	}

}
