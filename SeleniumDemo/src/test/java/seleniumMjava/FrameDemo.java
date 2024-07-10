package seleniumMjava;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		int countFrame = driver.findElements(By.tagName("frame")).size();
		System.out.println(1 + countFrame);

		for (int i = 0; i < countFrame; i++) {

			driver.switchTo().frame(i);
			System.out.println(driver.findElement(By.xpath("/html/body")).getText());
			driver.switchTo().parentFrame();
		}

	}

}