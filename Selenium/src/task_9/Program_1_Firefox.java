package task_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Program_1_Firefox {

	public static void main(String[] args) {
		
			WebDriverManager.firefoxdriver().setup();

	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();

	        driver.get("http://google.com");

	        // Print the page title
	        System.out.println("Page title is: " + driver.getTitle());

	        	

	}

}
