package seleniumMjava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo3 {

	public static void main(String[] args) throws Exception {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	    Alert alert2 = driver.switchTo().alert();
	    alert2.sendKeys("dismiss");
	    Thread.sleep(3000);
	    alert2.accept();

	    if(driver.getPageSource().contains("You entered: dismiss")) {
	        System.out.println("Validation Successful");
	        System.out.println("==================================");
	    }
	}

}
