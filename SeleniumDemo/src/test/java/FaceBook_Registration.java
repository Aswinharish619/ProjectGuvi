import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook_Registration {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input.inputtext[aria-label=\"First name\"]")).sendKeys("Harish");
		
		driver.findElement(By.cssSelector("input.inputtext[aria-label=\"Surname\"]")).sendKeys("Kumar");
		//1st way
		List<WebElement> birthd= driver.findElements(By.xpath("//select[@id='day']/option"));
		birthd.get(15).click();
		//2nd way
		WebElement birthm = driver.findElement(By.xpath("//select[@id='month']"));
		Select birthmoth1 = new Select(birthm);
		birthmoth1.selectByVisibleText("Mar");
		
		WebElement Birthy = driver.findElement(By.xpath("//select[@id='year']"));
		Select Birthyear = new Select(Birthy);
		Birthyear.selectByVisibleText("1991");
		
		List<WebElement> sex = driver.findElements(By.xpath("//label[@class='_58mt']"));
		sex.get(1).click();

		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_h_CQ'")).sendKeys("haris@gmail.com");
		//driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Password@123");
		
				
		driver.close();
		
		
	}

}
