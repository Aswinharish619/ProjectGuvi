package seleniumMjava;

import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownYear {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		// Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();
		// open URL for application
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
		// manage method to maximize the window
		driver.manage().window().maximize();

		Thread.sleep(3000);
		//1st Method not advice but used in industries 
		//driver.findElements(By.xpath("//select[@id='month']/option"));
		List<WebElement> birthYear= driver.findElements(By.xpath("//select[@id='year']/option"));
		System.out.println("Total Dropdwon values"+birthYear.size());
		birthYear.get(100).click();
		
		//2nd way
		WebElement by= driver.findElement(By.xpath("//select[@id='year']"));
		
		Select year= new Select(by);
		
		year.selectByIndex(60);
		Thread.sleep(3000);
		
		year.selectByVisibleText("1991");
		Thread.sleep(3000);
		
		year.selectByValue("50");
		Thread.sleep(3000);
	

	}

}
