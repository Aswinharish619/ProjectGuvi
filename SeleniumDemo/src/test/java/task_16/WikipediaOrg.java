package task_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaOrg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haris\\OneDrive\\Documents\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("https://www.selenium.dev/downloads/");
		
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		
		driver.findElement(By.xpath("//a[@href='https://www.selenium.dev/downloads/']")).click();

		Thread.sleep(3000);
		//driver.close();

	}

}
