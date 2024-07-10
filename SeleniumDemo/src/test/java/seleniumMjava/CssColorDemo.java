package seleniumMjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssColorDemo {

	public static void main(String[] args) {
		        
			 	WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://opensource-demo.orangehrmlive.com");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        String ExpectedHexColor = "#ff7b1d";
		        
		        String BackgroundColor = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getCssValue("background-color");
		        System.out.println(BackgroundColor);
		        
		        Color hexCode = Color.fromString(BackgroundColor);
		        String ActualHexColor = hexCode.asHex();
		        
		        System.out.println(ActualHexColor);
		        
		        if (ActualHexColor.equals(ExpectedHexColor)) {
		            System.out.println("Successful");
		        }else {
		        	System.out.println("Failed");
		        }

		        driver.get("");
		        
		        
		        
		        
		        
		        
	}
}
