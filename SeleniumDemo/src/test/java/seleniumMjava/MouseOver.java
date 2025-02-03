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
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		//Create the web element reference 
		WebElement Login=driver.findElement(By.id("loginbutton"));
		
		Actions act= new Actions(driver);
		 act.contextClick(Login).perform();
		
		Thread.sleep(2000);
		act.contextClick(Login).build().perform();
		
		System.out.println("done");
		driver.close();
		
		

	}

}
