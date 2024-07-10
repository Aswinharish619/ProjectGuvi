package task_17;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealSite {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(4000);

		try {
			// WebDriverWait wait = new WebDriverWait(driver, 10);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.get("https://www.snapdeal.com/");

			Actions action = new Actions(driver);

			// Locate the "Sign In" button
			WebElement signInButton = driver.findElement(By.xpath("//span[contains(text(), 'Sign In')]"));

			// Move to the "Sign In" button and click-and-hold
			action.moveToElement(signInButton).clickAndHold().perform();

			// Locate the "Login" button on the popup and click it
			WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(), 'login')]"));
			loginButton.click();

			List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
			if (!iframes.isEmpty()) {
				// Switch to the iframe if it exists
				driver.switchTo().frame(iframes.get(0));

				WebElement emailField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userName")));
				emailField.sendKeys("balamuralikaviya3105@gmail.com");

				WebElement continueButton = driver.findElement(By.xpath("//button[@id='checkUser']"));
				continueButton.click();

				Thread.sleep(12000);// enter otp

				WebElement loginOtp = driver.findElement(By.xpath("//button[@id='loginUsingOtp']"));
				loginOtp.click();
				
				//Verify user loggedIn successfully
				WebElement userProfile = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Bala')]")));
	            if (userProfile.isDisplayed()) {
	                System.out.println("Login successful");
	            } else {
	                System.out.println("Login failed");
	            }

			}
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		} finally {
			// Close the browser
			// driver.quit();
			System.out.println("DONE!!");

		}
	}
}
