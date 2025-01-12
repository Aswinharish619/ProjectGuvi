package task_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Program_1_Firefox {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.firefoxdriver().setup();

	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        
	        driver.get("http://google.com");//navigate to google.com
	        
	        driver.manage().window().maximize();

	        // Print the page title
	        System.out.println("Page title is: " + driver.getTitle());
	        
	        Thread.sleep(3000);
	        
	        driver.navigate().refresh(); // Reload the page
	        
	        Thread.sleep(3000);
	        
	        driver.close();

	}

}
