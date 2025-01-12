package task_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program_3_wikipedia {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
			
		Thread.sleep(2000);

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial intelligence");
		
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='History']")).click();
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();


	}

}
