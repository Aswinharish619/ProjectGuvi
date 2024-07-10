package seleniumMjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		//Create the web element reference 
		WebElement downloads=driver.findElement(By.xpath("//*[contains(@href, '/downloads')]"));
		
		Actions act= new Actions(driver);
		act.moveToElement(downloads).build().perform();
		
		Thread.sleep(3000);
		act.contextClick(downloads).build().perform();
		
		System.out.println("done");
		
		
		

	}

}
