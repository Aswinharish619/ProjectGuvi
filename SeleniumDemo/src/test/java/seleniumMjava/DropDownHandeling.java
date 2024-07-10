package seleniumMjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandeling {

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
		List<WebElement> birthMonth= driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total Dropdwon values"+birthMonth.size());
		birthMonth.get(11).click();
		
		//2nd way
		WebElement bm= driver.findElement(By.xpath("//select[@id='month']"));
		
		Select month= new Select(bm);
		
		month.selectByIndex(10);
		month.selectByVisibleText("Mar");
		month.selectByValue("7");
		
		System.out.println(month.getFirstSelectedOption().getText());//July
		System.out.println(month.isMultiple());//False
		
	}

}
