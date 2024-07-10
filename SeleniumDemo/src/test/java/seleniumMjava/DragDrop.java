package seleniumMjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {
 
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		//Create the web element reference 
		WebElement boxA =driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement boxB =driver.findElement(By.id("column-b"));
		
		Actions actions =new Actions(driver);
		actions.moveToElement(boxA);
		actions.clickAndHold();
		actions.moveToElement(boxB);
		
		actions.release().perform();
		Thread.sleep(2000);
		driver.close();
		
		
	
		
		

	}

}
