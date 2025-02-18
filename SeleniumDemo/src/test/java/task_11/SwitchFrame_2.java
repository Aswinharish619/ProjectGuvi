package task_11;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchFrame_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("http://the-internet.herokuapp.com/nested_frames");
			driver.manage().window().maximize();
			Thread.sleep(3000);

			WebElement topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
			String topframename = topframe.getAttribute("name");
			driver.switchTo().frame(topframe);Thread.sleep(3000);
			System.out.println(topframename);
			
			
			  List<WebElement> frames = driver.findElements(By.tagName("frame")); if
			  (frames.size() == 3) {
			  System.out.println("Three frames are present on the webpage"); } else {
			  System.out.println("Frames not matching"); }
			 
			
			WebElement leftframe =driver.findElement(By.xpath("//frame[@name='frame-left']"));
			driver.switchTo().frame(leftframe);
			String leftText = driver.findElement(By.tagName("body")).getText();
			System.out.println(leftText);
			
			// Switch to topFrame
			driver.switchTo().defaultContent();
			driver.switchTo().frame(topframe);
			
			Thread.sleep(3000);			
			WebElement middleframe = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
			driver.switchTo().frame(middleframe);
			String middleText = driver.findElement(By.tagName("body")).getText();
			System.out.println(middleText);

			// Switch to topFrame
			driver.switchTo().defaultContent();
			driver.switchTo().frame(topframe);

			WebElement rightframe = driver.findElement(By.xpath("//frame[@name='frame-right']"));
			driver.switchTo().frame(rightframe);
			String rightText = driver.findElement(By.tagName("body")).getText();
			System.out.println(rightText);

			// Switch to defaultContent unable to switch to topframe as frame located outside
						driver.switchTo().defaultContent();
									
			WebElement bottomframe = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
			driver.switchTo().frame(bottomframe);
			String bottemText = driver.findElement(By.tagName("body")).getText();
			System.out.println(bottemText);
			
			// Switch to topFrame
						driver.switchTo().defaultContent();
						driver.switchTo().frame(topframe);

		} catch (NoSuchFrameException e) {
			System.out.println("Element not found: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Element not found: " + e.getMessage());
		} finally {
			// Quit the driver
			driver.quit();

		}

	}

}
