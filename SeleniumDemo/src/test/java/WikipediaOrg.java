

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaOrg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\haris\\OneDrive\\Documents\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.wikipedia.org/");

		driver.manage().window().maximize();

		driver.findElement(By.name("search")).sendKeys("Artificial intelligence");
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#History']")).click();

		Thread.sleep(5000);
		driver.close();

	}

}
