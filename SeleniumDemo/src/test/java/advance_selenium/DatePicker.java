package advance_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/25/2025");
		
		String Year="2025";
		String Month="December";
		String Date="25";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
			
			String CurrentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String CurrentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if(Year.equals(CurrentYear)& Month.equals(CurrentMonth)) {
				
				break;
				
			}
			
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//right side
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//left side
			//ui-icon ui-icon-circle-triangle-e		
		}
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement ad:alldates) {
			
			if(ad.getText().equals(Date)) {
				ad.click();
				break;
			}
		}

	}

}
