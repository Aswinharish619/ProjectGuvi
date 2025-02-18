package advance_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptSendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement textbox= driver.findElement(By.id("email")); 
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//Passing text into text box: alternate option to sendKeys()
		js.executeScript("arguments[0].setArribute('value','Demo@gmail.com')", textbox);
		
			}

}
