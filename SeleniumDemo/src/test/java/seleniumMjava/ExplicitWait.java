package seleniumMjava;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tickets.paytm.com/international-flights/");
		
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.switchTo().frame("oauth-iframe");
		driver.findElement(By.id("email_mobile_login")).sendKeys("057114774");

	}

}
