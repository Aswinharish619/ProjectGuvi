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
		
		
		WebElement boxA =driver.findElement(By.id("column-a"));
		WebElement boxB =driver.findElement(By.id("column-b"));
		Thread.sleep(1000);
		Actions actions =new Actions(driver);
		actions.dragAndDrop(boxA, boxB);
		actions.build().perform();
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
	
		
		

	}

}
