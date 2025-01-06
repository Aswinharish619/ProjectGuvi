import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemoProgram {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://signup.heroku.com/");
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/*
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Mohammed Nazar");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Abdul");
		driver.findElement(By.xpath("//input[@type='email'][@name='email']")).sendKeys("email@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'company')]")).sendKeys("Modern Company");
		driver.findElement(By.partialLinkText("Privacy Policy")).click();
		*/
		//driver.findElement(By.xpath("//a[text()='Register now!']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register now!')]")).click();
		
		
	}

}
