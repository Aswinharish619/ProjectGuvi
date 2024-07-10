package seleniumMjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItOpenFile {

	public static void main(String[] args) throws Exception {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.file.io/");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//label[normalize-space()='Upload Files']")).click();
	    Runtime.getRuntime().exec("C:\\Users\\haris\\OneDrive\\Desktop\\AutoitOpenfile1.exe");
	    System.out.println("Test Executed Successfully.");
	}


}
