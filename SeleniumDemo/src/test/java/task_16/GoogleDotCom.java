package task_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleDotCom {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\haris\\OneDrive\\Documents\\Software\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		driver.quit();

	}

}
